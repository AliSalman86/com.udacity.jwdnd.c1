package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
		System.out.println("Hello Spring");
	}

	@Bean
	public String basicMessage() {
		System.out.println("inside basicMessage");
		return "Hello";
	}
	@Primary
	@Bean
	public String componundMessage(String basicMessage) {
		System.out.println("inside compoundMessage, received: " + basicMessage);
		return basicMessage + ", Spring";
	}
	@Bean
	public int characterCount(String message) {
		System.out.println(message.length());
		return message.length();
	}
}
