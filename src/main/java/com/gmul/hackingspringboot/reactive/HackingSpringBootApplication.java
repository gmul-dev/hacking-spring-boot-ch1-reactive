package com.gmul.hackingspringboot.reactive;

import com.gmul.hackingspringboot.reactive.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HackingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackingSpringBootApplication.class, args);
	}

	@Component
	public class TemplateDatabaseLoader {

		@Bean
		CommandLineRunner initialize(MongoOperations mongo) {
			return args -> {
				mongo.save(new Item("Alf alarm clock", 19));
				mongo.save(new Item("Smurf TV tray", 24.99));
			};
		}
	}
}
