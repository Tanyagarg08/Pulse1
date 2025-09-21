package com.pulse1.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI pulse1OpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Pulse1 API")
                .description("Full backend APIs for Pulse1")
                .version("1.0.0"));
    }
}