package com.example.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demospringboot.entity")
public class DemospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}

}
