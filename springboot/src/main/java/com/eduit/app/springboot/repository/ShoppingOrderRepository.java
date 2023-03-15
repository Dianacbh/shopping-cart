package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.ShoppingOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingOrderRepository extends CrudRepository<ShoppingOrderEntity, Long> {

}
