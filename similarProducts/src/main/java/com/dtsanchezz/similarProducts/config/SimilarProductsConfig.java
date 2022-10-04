package com.dtsanchezz.similarProducts.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class SimilarProductsConfig {

    private static final int CONNECTION_TIMEOUT = 500;
    private static final int READ_TIMEOUT = 1000;
    ;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofMillis(CONNECTION_TIMEOUT))
                .setReadTimeout(Duration.ofMillis(READ_TIMEOUT))
                .build();
    }
}
