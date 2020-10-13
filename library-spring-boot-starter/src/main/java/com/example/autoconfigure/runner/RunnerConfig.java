package com.example.autoconfigure.runner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunnerConfig {

    @Bean
    Runner runner() {
        return new Runner();
    }
}
