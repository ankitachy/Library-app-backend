package com.library.booksprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BooksprofileApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksprofileApplication.class, args);
	}

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
