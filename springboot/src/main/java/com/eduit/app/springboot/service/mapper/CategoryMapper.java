package com.eduit.app.springboot.service.mapper;

import com.eduit.app.springboot.DTO.CategoryRequestDTO;
import com.eduit.app.springboot.entity.CategoryEntity;
import com.eduit.app.springboot.model.CategoryDTO;

public interface CategoryMapper<CategoryRequestDTO> {

    CategoryEntity map(final CategoryRequestDTO theCategory);

    CategoryEntity map(final CategoryDTO theCategory);

    CategoryDTO map(final CategoryEntity theCategory);

    CategoryEntity map(com.eduit.app.springboot.DTO.CategoryRequestDTO theCategory);
}