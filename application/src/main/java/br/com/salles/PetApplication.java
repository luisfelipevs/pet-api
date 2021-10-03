package br.com.salles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class PetApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(PetApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
		logger.info("Starting Pet Application -1");
	}

}
