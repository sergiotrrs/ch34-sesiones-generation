package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.Product;
import org.generation.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
	ResponseEntity< List<Product> > getAllUsers(){
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK );
	}
	
	@GetMapping("{id}")
	ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
		Product product = productService.getProductById(id);
		return new ResponseEntity<>(product, HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<Product> createProduct(@Validated @RequestBody Product product) {	
		Product newProduct = productService.createProduct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.CREATED );
	}
	

	@PutMapping("{id}")
	ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("id") Long id) {
		Product updatedProduct = productService.updateProduct(product, id);
		return new ResponseEntity<>(updatedProduct, HttpStatus.OK );
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteProduct(@PathVariable("id") Long id ) {
		productService.deleteProduct(id);
		return new ResponseEntity<>("Product id " + id + " successfully deleted", HttpStatus.OK );
	}
}
