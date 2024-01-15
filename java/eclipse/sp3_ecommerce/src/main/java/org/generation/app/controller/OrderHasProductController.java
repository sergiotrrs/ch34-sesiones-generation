package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.OrderHasProduct;
import org.generation.app.entity.compositeKey.OrderProductKey;
import org.generation.app.service.OrderHasProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/orders-has-products")
public class OrderHasProductController {

	@Autowired
	OrderHasProductService orderHasProductService;
	@Autowired
	OrderProductKey idOrderProduct;
	
	@GetMapping
	ResponseEntity< List<OrderHasProduct> > getAllOrdersHasProducts(){
		List<OrderHasProduct> orders = orderHasProductService.getAllOrderHasProducts();
		return new ResponseEntity<>(orders, HttpStatus.OK );
	}
	
	@GetMapping("/{idOrder}/{idProduct}")
	ResponseEntity<OrderHasProduct> getOrderById(
			@PathVariable("idOrder") Long idOrder, 
			@PathVariable("idProduct") Long idProduct
			) {
		idOrderProduct.setOrderId(idOrder);
		idOrderProduct.setProductId(idProduct);
		OrderHasProduct orderHasProduct = orderHasProductService.getOrderHasProductById(idOrderProduct);
		return new ResponseEntity<>(orderHasProduct, HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<OrderHasProduct> createOrder(@Validated @RequestBody OrderHasProduct orderHasProduct) {	
		OrderHasProduct newOrderHasProduct = orderHasProductService.createOrderHasProduct(orderHasProduct);
		return new ResponseEntity<>(newOrderHasProduct, HttpStatus.CREATED );
	}	

	@PutMapping("/{idOrder}/{idProduct}")
	ResponseEntity<OrderHasProduct> updateOrderHasProduct(
			@RequestBody OrderHasProduct orderHasProduct, 
			@PathVariable("idOrder") Long idOrder, 
			@PathVariable("idProduct") Long idProduct
			) {
		idOrderProduct.setOrderId(idOrder);
		idOrderProduct.setProductId(idProduct);
		OrderHasProduct updatedOrderHasPRoduct = orderHasProductService.updateOrderHasProduct(orderHasProduct, idOrderProduct);
		return new ResponseEntity<>(updatedOrderHasPRoduct, HttpStatus.OK );
	}
	
	@DeleteMapping("/{idOrder}/{idProduct}")
	ResponseEntity<String> deleteOrderHasProduct(
			@PathVariable("idOrder") Long idOrder, 
			@PathVariable("idProduct") Long idProduct 
			) {		
		idOrderProduct.setOrderId(idOrder);
		idOrderProduct.setProductId(idProduct);
		orderHasProductService.deleteOrderHasProduct(idOrderProduct);
		return new ResponseEntity<>("Order-Product id " + idOrderProduct + " successfully deleted", HttpStatus.OK );
	}
}
