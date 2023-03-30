package com.eduit.app.springboot.repository;

import org.springframework.data.repository.CrudRepository;

public interface ShoppingOrderRepository<ShoppingOrderEntity> extends CrudRepository<ShoppingOrderEntity, Long> {

}
