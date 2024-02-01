package com.example.springfoundation;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public DataSource dataSource() {
        JdbcDataSource jdbcDataSource = new JdbcDataSource();
        jdbcDataSource.setUrl("jdbc:h2:mem:testdb");
        jdbcDataSource.setUser("sa");
        jdbcDataSource.setPassword("password");
        return jdbcDataSource;
    }
}
