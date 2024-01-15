package org.generation.app.service.impl;

import java.util.List;

import org.generation.app.entity.Product;
import org.generation.app.repository.ProductRepository;
import org.generation.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product); 
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("Product does not exist with id " + id));
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product, Long id) {
		Product existingProduct = getProductById(id);
		existingProduct.setName( product.getName() );
		existingProduct.setPrice( product.getPrice() );
		return productRepository.save( existingProduct );
	}

	@Override
	public void deleteProduct(Long id) {
		Product existingProduct = getProductById(id);
		productRepository.delete(existingProduct);		
	}

}
