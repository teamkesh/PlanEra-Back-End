package com.planera.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.planera"})
@EntityScan("com.planera.services")
@EnableMongoRepositories("com.planera.repositories")
public class PlanEraBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanEraBackendApplication.class, args);
	}

}
