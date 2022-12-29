package com.infy.SpringBootRestApiCrudApp.app.servicei;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;

public interface ProductService {

	public Product saveProduct(Product p);

	public void getProduct();

	public Iterable<Product> displayAllProduct();

	public void deleteProduct(Integer productId);


}
