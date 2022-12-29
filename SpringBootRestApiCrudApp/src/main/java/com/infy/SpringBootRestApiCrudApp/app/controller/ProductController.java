package com.infy.SpringBootRestApiCrudApp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;
import com.infy.SpringBootRestApiCrudApp.app.servicei.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "api")
public class ProductController {
	
	@Autowired
	ProductService psi;
	
	//Post API
	@PostMapping(value = "/product")
	public Product saveProduct(@RequestBody Product p)
	{
		Product product=psi.saveProduct(p);
		return product;	
	}
	
	//Update API
	@PutMapping(value = "/product")
	public Product updateProduct(@RequestBody Product p)
	{
		Product product=psi.saveProduct(p);
		return p;	
	}
	
	//GetAPI
	@GetMapping(value = "/product")
	public Iterable<Product> getProduct()
	{
		psi.getProduct();
		Iterable<Product> ip=psi.displayAllProduct();
		return ip;	
	}
	
	//Delete API
	@DeleteMapping(value = "/product/{productId}")
	public String deleteProduct(@PathVariable("productId") Integer productId)
	{
		psi.deleteProduct(productId);
		
		Iterable<Product> ip=psi.displayAllProduct();
		return "Data Deleted";	
	}

}
