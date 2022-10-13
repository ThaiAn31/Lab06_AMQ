package com.example.Lab06_AMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class Lab06AmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab06AmqApplication.class, args);
	}

}
