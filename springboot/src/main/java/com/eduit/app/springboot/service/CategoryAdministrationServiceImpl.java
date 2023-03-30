package com.eduit.app.springboot.service;

import com.eduit.app.springboot.DTO.CategoryRequestDTO;
import com.eduit.app.springboot.entity.CategoryEntity;
import com.eduit.app.springboot.model.CategoryDTO;
import com.eduit.app.springboot.repository.CategoryRepository;
import com.eduit.app.springboot.service.mapper.CategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryAdministrationServiceImpl implements CategoryAdministrationService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ProductAdministrationServiceImpl.class);

    private CategoryRepository categoryRepository;

    private CategoryMapper mapper;

    public CategoryAdministrationServiceImpl(final CategoryMapper theCategoryMapper,
                                             final CategoryRepository theCategoryRepository) {
        categoryRepository = theCategoryRepository;
        mapper = theCategoryMapper;
    }

    @Override
    public List<CategoryDTO> retrieveAll() throws RuntimeException {
        LOGGER.trace(String.format("Listing all categories"));
        Iterable<CategoryEntity> products = categoryRepository.findAll();
        Iterator<CategoryEntity> iter = products.iterator();
        List<CategoryDTO> response = new ArrayList<>();
        while (iter.hasNext()) {
            response.add(mapper.map(iter.next()));
        }
        return response;
    }

    @Override
    public CategoryDTO retrieve(Long id) throws RuntimeException {
        return null;
    }

    @Override
    public CategoryDTO create(CategoryRequestDTO element) throws RuntimeException {
        return null;
    }

    @Override
    public CategoryDTO update(CategoryDTO element) throws RuntimeException {
        return null;
    }

    @Override
    public void delete(Long id) throws RuntimeException {

    }

    @Override
    public List<CategoryDTO> retrieveChildren(Long id) throws RuntimeException {
        return null;
    }

}
