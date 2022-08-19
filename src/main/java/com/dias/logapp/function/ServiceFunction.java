package com.dias.logapp.function;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@Slf4j
public class ServiceFunction {

    @Bean
    public Function<String, String> uppercase() {
        return value -> {
            log.debug("Debug");
            log.info("Info");
            log.warn("Warn");
            log.error("Error");
            if (value.contains("exception")) {
                throw new RuntimeException("Intentional exception");
            }else {
                return value.toUpperCase() + " | Converted";
            }
        };
    }
}
