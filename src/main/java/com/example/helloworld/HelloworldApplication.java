package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {
	@Value("${IP_DATABASE}")
	String ipDatabase;

	@RestController
	class HelloworldController {
		@GetMapping("/")

		String hello() {
			return "Hello World from service 1!  The database ip value:" + ipDatabase  ;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}