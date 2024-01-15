package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	Product getProductById(Long id);
	List<Product> getAllProducts();
	Product updateProduct(Product user, Long id);
	void deleteProduct(Long id);

}
