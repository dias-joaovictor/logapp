package com.dias.logapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
@Slf4j
public class LogappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogappApplication.class, args);
	}

}
