package com.eduit.app.springboot.service.utils;

import com.eduit.app.springboot.model.ProductDTO;
import com.eduit.app.springboot.service.CrudAdministrationService;

public interface ProductAdministrationService<ProductRequestDTO>
        extends CrudAdministrationService<ProductDTO, ProductRequestDTO, Long> {

}
