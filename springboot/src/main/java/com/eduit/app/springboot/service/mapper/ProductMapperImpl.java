package com.eduit.app.springboot.service.mapper;

import com.eduit.app.springboot.DTO.ProductRequestDTO;
import com.eduit.app.springboot.entity.ProductEntity;
import com.eduit.app.springboot.model.ProductDTO;
import com.eduit.app.springboot.service.UserAdministrationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDate;

import static com.eduit.app.springboot.Utils.DateUtils.toDate;
import static com.eduit.app.springboot.Utils.DateUtils.toLocalDate;

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
        response.setDescription(theProduct.getName());
        response.setCategory(categoryMapper.map(theProduct.getCategory()));
        if (theProduct.getDateCreated() != null) {
            response.setDateCreated(toDate(theProduct.getDateCreated()));
        }
        return response;
    }


    public ProductDTO map(final ProductEntity theProduct) {
        LOGGER.trace(String.format("Mapping ProductDTO with attributes: %s to: ProductEntity", theProduct.toString()));
        ProductDTO response = new ProductDTO();
        response.setId(theProduct.getId());
        response.setName(theProduct.getName());
        response.setPrice(theProduct.getPrice().doubleValue());
        response.setDescription(theProduct.getName());
        response.setCategory(categoryMapper.map(theProduct.getCategory()));
        if (theProduct.getDateCreated() != null) {
            LocalDate createdLocalDate = toLocalDate(theProduct.getDateCreated());
            response.setDateCreated(createdLocalDate);
        }

        return response;
    }

    @Override
    public ProductEntity map(ProductRequestDTO theProduct) {
        LOGGER.info(String.format("Mapping ProductEntity with attributes: %s to: ProductDTO", theProduct.toString()));
        ProductEntity response = new ProductEntity();
        response.setName(theProduct.getName());
        response.setPrice(BigDecimal.valueOf(theProduct.getPrice()));
        response.setQty(theProduct.getQty());
        response.setDescription(theProduct.getName());
        response.setCategory(categoryMapper.map(theProduct.getCategory()));

        return response;
    }

}