package com.example.springfoundation;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class TestConfiguration {

    @Bean
    public DataSource dataSource() {
        JdbcDataSource jdbcDataSource = new JdbcDataSource();
        jdbcDataSource.setUrl("jdbc:h2:mem:testdb");
        jdbcDataSource.setUser("test");
        jdbcDataSource.setPassword("test");
        return jdbcDataSource;
    }
}
