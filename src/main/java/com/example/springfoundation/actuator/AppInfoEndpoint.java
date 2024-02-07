package com.example.springfoundation.actuator;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@WebEndpoint(id = "appInfo")
@RequiredArgsConstructor
public class AppInfoEndpoint {

    private final Environment environment;

    @ReadOperation
    public Map<String, String> infoMap() {
        var activeProfiles = String.join(", ", environment.getActiveProfiles());
        return Map.of(
                "JDBC URL", environment.getRequiredProperty("spring.datasource.url"),
                "Active profiles", activeProfiles
        );
    }
}
