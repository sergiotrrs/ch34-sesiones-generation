package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Order;

public interface OrderService {
	
	Order createOrder(Order order);
	Order getOrderById(Long id);
	List<Order> getAllOrders();
	Order updateOrder(Order user, Long id);
	void deleteOrder(Long id);

}
