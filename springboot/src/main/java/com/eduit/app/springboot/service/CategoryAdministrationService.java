package com.eduit.app.springboot.service;

import com.eduit.app.springboot.DTO.CategoryRequestDTO;
import com.eduit.app.springboot.model.CategoryDTO;

import java.util.List;

public interface CategoryAdministrationService
        extends CrudAdministrationService<CategoryDTO, CategoryRequestDTO, Long>{

    List<CategoryDTO> retrieveChildren(final Long id) throws RuntimeException;
}