package com.eduit.app.springboot.service.mapper;

import com.eduit.app.springboot.entity.ProductEntity;
import com.eduit.app.springboot.model.ProductDTO;
import com.eduit.app.springboot.service.UserAdministrationServiceImpl;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductMapperImpl implements ProductMapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAdministrationServiceImpl.class);

    private CategoryMapper categoryMapper;

    public ProductMapperImpl(CategoryMapper theCategoryMapper) {
        categoryMapper = theCategoryMapper;
    }

    public ProductEntity map(final ProductDTO theProduct) {
        LOGGER.trace(String.format("Mapping ProductEntity with attributes: %s to: ProductDTO", theProduct.toString()));
        ProductEntity response = new ProductEntity();
        response.setId(theProduct.getId());
        response.setName(theProduct.getName());
        response.setPrice(BigDecimal.valueOf(theProduct.getPrice()));
        response.setQty(theProduct.getQty());
        response.setDescription(theProduct.getName());
        response.setCategory(categoryMapper.map(theProduct.getCategory()));
        if (theProduct.getDateCreated() != null) {
            response.setDateCreated(DateUtils.toDate(theProduct.getDateCreated()));
        }
        if (theProduct.getDateDeleted() != null) {
            response.setDateDeleted(DateUtils.toDate(theProduct.getDateDeleted()));
        }
        return response;
    }


    public ProductDTO map(final ProductEntity theProduct) {
        LOGGER.trace(String.format("Mapping ProductDTO with attributes: %s to: ProductEntity", theProduct.toString()));
        ProductDTO response = new ProductDTO();
        response.setId(theProduct.getId());
        response.setName(theProduct.getName());
        response.setPrice(theProduct.getPrice().doubleValue());
        response.setQty(theProduct.getQty());
        response.setDescription(theProduct.getName());
        response.setCategory(categoryMapper.map(theProduct.getCategory()));
        if (theProduct.getDateCreated() != null) {
            LocalDate createdLocalDate = DateUtils.toLocalDate(theProduct.getDateCreated());
            response.setDateCreated(createdLocalDate);
        }
        if (theProduct.getDateDeleted() != null) {
            LocalDate deletedLocalDate = DateUtils.toLocalDate(theProduct.getDateDeleted());
            response.setDateDeleted(deletedLocalDate);
        }

        return response;
    }

    @Override
    public ProductEntity map(ProductRequestDTO theProduct) {
        LOGGER.trace(String.format("Mapping ProductEntity with attributes: %s to: ProductDTO", theProduct.toString()));
        ProductEntity response = new ProductEntity();
        response.setName(theProduct.getName());
        response.setPrice(BigDecimal.valueOf(theProduct.getPrice()));
        response.setQty(theProduct.getQty());
        response.setDescription(theProduct.getName());
        response.setCategory(categoryMapper.map(theProduct.getCategory()));
        response.setDateCreated(new Date());

        return response;
    }

}