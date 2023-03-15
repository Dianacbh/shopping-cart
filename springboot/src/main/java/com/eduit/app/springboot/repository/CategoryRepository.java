package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.CategoryEntity;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface CategoryRepository extends Repository <CategoryEntity, Long> {

    List<CategoryEntity> findByParentCategory(CategoryEntity parentCategory);


    CategoryEntity findOneByName(String userName);
}
