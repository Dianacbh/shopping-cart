package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.ProductEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProductRepository extends Repository <ProductEntity, Long> {

    List<ProductEntity> findByCategory(ProductEntity parentCategory);
}
