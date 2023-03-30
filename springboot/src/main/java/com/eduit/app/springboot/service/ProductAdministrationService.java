package com.eduit.app.springboot.service;

import com.eduit.app.springboot.DTO.ProductRequestDTO;
import com.eduit.app.springboot.model.ProductDTO;

public interface ProductAdministrationService
        extends CrudAdministrationService<ProductDTO, ProductRequestDTO, Long> {

}
