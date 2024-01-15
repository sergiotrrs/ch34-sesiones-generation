package org.generation.app.service.impl;

import java.util.List;

import org.generation.app.entity.Order;
import org.generation.app.repository.OrderRepository;
import org.generation.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order); 
	}

	@Override
	public Order getOrderById(Long id) {
		return orderRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("Order does not exist with id " + id));
	}

	@Override
	public List<Order> getAllOrders() {
		return (List<Order>) orderRepository.findAll();
	}

	@Override
	public Order updateOrder(Order order, Long id) {
		Order existingOrder = getOrderById(id);
		existingOrder.setTotalAmount( order.getTotalAmount() );
		existingOrder.setPurchaseDate( order.getPurchaseDate() );
		return orderRepository.save( existingOrder );
	}

	@Override
	public void deleteOrder(Long id) {
		Order existingOrder = getOrderById(id);
		orderRepository.delete(existingOrder);		
	}

}
