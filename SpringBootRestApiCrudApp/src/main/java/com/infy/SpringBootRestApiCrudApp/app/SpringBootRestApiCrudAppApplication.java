package com.infy.SpringBootRestApiCrudApp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;

@SpringBootApplication
public class SpringBootRestApiCrudAppApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Rest Api Crud App");
		SpringApplication.run(SpringBootRestApiCrudAppApplication.class, args);

	}

}
