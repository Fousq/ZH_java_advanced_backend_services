package com.example.springfoundation.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConf {

    @Bean
    public SecurityFilterChain web(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests((authorize) ->
                        authorize.requestMatchers("/actuator/**").permitAll()
                                .anyRequest().authenticated()
                )
                .build();
    }
}
