package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

	List<ProductEntity> findByCategory(ProductEntity parentCategory);
	
}
