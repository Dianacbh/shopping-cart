package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.CartEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartEntity, Long> {

}
