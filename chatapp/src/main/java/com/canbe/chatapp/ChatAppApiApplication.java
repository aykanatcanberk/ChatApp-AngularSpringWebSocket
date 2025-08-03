package com.canbe.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ChatAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatAppApiApplication.class, args);
	}

}
