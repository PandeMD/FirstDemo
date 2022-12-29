package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceClient1Application {

	public static void main(String[] args) {
		System.out.println("Micro Service Exam Client");
		SpringApplication.run(MicroServiceClient1Application.class, args);
	}

}
