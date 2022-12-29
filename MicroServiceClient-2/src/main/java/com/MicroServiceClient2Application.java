package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceClient2Application {

	public static void main(String[] args) {
		System.out.println("Micro Service Result Client");
		SpringApplication.run(MicroServiceClient2Application.class, args);
	}

}
