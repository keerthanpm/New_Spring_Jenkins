package com.example.jenins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JeniknsEx1Application {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(JeniknsEx1Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("application main started");
		SpringApplication.run(JeniknsEx1Application.class, args);
		logger.info("application main executed");
		
		
	}

}
