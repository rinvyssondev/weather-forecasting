package com.weatherforecasting.weatherforecasting.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {

    @Bean
    public OpenAPI api() {
        try {
            return new OpenAPI()
                .info(new Info()
                        .title("Weather Forecasting API")
                        .version("1.0")
                        .description("Weather Forecasting API")
                );
        } catch(Exception e) {
            System.err.println("Error configuring OpenAPI: " + e.getMessage());
            throw e;
        }
    }
}
