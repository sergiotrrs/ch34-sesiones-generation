package org.generation.app.repository;

import org.generation.app.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long > {

}
