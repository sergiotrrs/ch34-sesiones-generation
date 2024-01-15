package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.Order;
import org.generation.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping
	ResponseEntity< List<Order> > getAllOrders(){
		List<Order> orders = orderService.getAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK );
	}
	
	@GetMapping("{id}")
	ResponseEntity<Order> getOrderById(@PathVariable("id") Long id) {
		Order order = orderService.getOrderById(id);
		return new ResponseEntity<>(order, HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<Order> createOrder(@Validated @RequestBody Order order) {	
		Order newOrder = orderService.createOrder(order);
		return new ResponseEntity<>(newOrder, HttpStatus.CREATED );
	}
	

	@PutMapping("{id}")
	ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable("id") Long id) {
		Order updatedOrder = orderService.updateOrder(order, id);
		return new ResponseEntity<>(updatedOrder, HttpStatus.OK );
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteOrder(@PathVariable("id") Long id ) {
		orderService.deleteOrder(id);
		return new ResponseEntity<>("Order id " + id + " successfully deleted", HttpStatus.OK );
	}
}
