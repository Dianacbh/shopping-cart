package com.eduit.app.springboot.service.mapper;

import com.eduit.app.springboot.DTO.ProductRequestDTO;
import com.eduit.app.springboot.entity.ProductEntity;
import com.eduit.app.springboot.model.ProductDTO;

public interface ProductMapper {

    ProductEntity map(final ProductRequestDTO theProduct);

    ProductEntity map(final ProductDTO theProduct);

    ProductDTO map(final ProductEntity theProduct);
}