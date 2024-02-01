package com.example.springfoundation;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

@SpringBootTest
class TestConfigurationTest {

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();

		Executable createTable = () -> statement.execute("CREATE TABLE test_table (ID INT PRIMARY KEY, NAME VARCHAR(255));");
		Executable saveEntity = () -> statement.execute("INSERT INTO test_table(ID, NAME) VALUES (1, 'Hello');");

		assertInstanceOf(JdbcDataSource.class, dataSource);
		JdbcDataSource jdbcDataSource = (JdbcDataSource) dataSource;
		assertEquals("test", jdbcDataSource.getUser());
		assertAll(() -> {
			assertDoesNotThrow(createTable);
			assertDoesNotThrow(saveEntity);
		});
	}

}
