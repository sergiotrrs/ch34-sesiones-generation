package org.generation.app.repository;

import org.generation.app.entity.OrderHasProduct;
import org.generation.app.entity.compositeKey.OrderProductKey;
import org.springframework.data.repository.CrudRepository;

public interface OrderHasProductRepository extends CrudRepository<OrderHasProduct, OrderProductKey> {

}
