package com.infy.SpringBootRestApiCrudApp.app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;

@Repository
public interface ProductRepositary extends JpaRepository<Product, Integer>{

	
	
}
