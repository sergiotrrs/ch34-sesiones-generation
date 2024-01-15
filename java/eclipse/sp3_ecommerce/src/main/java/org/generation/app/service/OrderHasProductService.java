package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.OrderHasProduct;
import org.generation.app.entity.compositeKey.OrderProductKey;

public interface OrderHasProductService {
	
	OrderHasProduct createOrderHasProduct(OrderHasProduct orderHasProduct);
	OrderHasProduct getOrderHasProductById(OrderProductKey id);
	List<OrderHasProduct> getAllOrderHasProducts();
	OrderHasProduct updateOrderHasProduct(OrderHasProduct user, OrderProductKey id);
	void deleteOrderHasProduct(OrderProductKey id);

}
