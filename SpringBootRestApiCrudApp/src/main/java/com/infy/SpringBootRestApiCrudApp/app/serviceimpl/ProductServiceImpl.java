package com.infy.SpringBootRestApiCrudApp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;
import com.infy.SpringBootRestApiCrudApp.app.repositary.ProductRepositary;
import com.infy.SpringBootRestApiCrudApp.app.servicei.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepositary pr;

	@Override
	public Product saveProduct(Product p) {
		return pr.save(p);
	}

	@Override
	public void getProduct() {
		pr.findAll();
	}

	@Override
	public Iterable<Product> displayAllProduct() {
		return pr.findAll();
	}

	@Override
	public void deleteProduct(Integer productId) {
		pr.deleteById(productId);
	}

	

}
