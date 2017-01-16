package com.cnotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CommonDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonDataServiceApplication.class, args);
	}
}
