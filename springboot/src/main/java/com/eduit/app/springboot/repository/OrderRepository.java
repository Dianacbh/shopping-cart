package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.OrderEntity;
import org.springframework.data.repository.Repository;

public interface OrderRepository extends Repository<OrderEntity, Long> {

}
