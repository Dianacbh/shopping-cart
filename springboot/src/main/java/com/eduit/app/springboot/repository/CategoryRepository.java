package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
	
	List<CategoryEntity> findByParent(CategoryEntity parentCategory);
	
	Optional<CategoryEntity> findOneByName(String name);
}
