package com.eduit.app.springboot.service;

import com.eduit.app.springboot.DTO.ProductRequestDTO;
import com.eduit.app.springboot.entity.ProductEntity;
import com.eduit.app.springboot.model.ProductDTO;
import com.eduit.app.springboot.repository.ProductRepository;
import com.eduit.app.springboot.service.mapper.ProductMapper;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class ProductAdministrationServiceImpl implements ProductAdministrationService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ProductAdministrationServiceImpl.class);

    private ProductRepository productRepository;

    private ProductMapper productMapper;

    public ProductAdministrationServiceImpl(final ProductMapper theProductMapper,
                                            final ProductRepository theProductRepository) {
        productRepository = theProductRepository;
        productMapper = theProductMapper;
    }

    @Override
    public List<ProductDTO> retrieveAll() throws RuntimeException {
        LOGGER.info(String.format("Listing all products"));
        Iterable<ProductEntity> products = productRepository.findAll();
        Iterator<ProductEntity> iter = products.iterator();
        List<ProductDTO> response = new ArrayList<>();
        while (iter.hasNext()) {
            response.add(productMapper.map(iter.next()));
        }
        return response;
    }

    @Override
    public ProductDTO retrieve(Long id) throws RuntimeException {
        Optional<ProductEntity> opProd = productRepository.findById(id);
        if (opProd.isEmpty()) {
            throw new RuntimeException(String.format("The product could not be found under id %d", id));
        }
        return productMapper.map(opProd.get());
    }

    @Override
    public ProductDTO create(ProductRequestDTO element) throws RuntimeException {
        ProductEntity product =  productMapper.map(element);
        productRepository.save(product);
        return productMapper.map(product);
    }

    @Override
    public ProductDTO update(ProductDTO element) throws RuntimeException {
        ProductEntity product =  productMapper.map(element);
        productRepository.save(product);
        return productMapper.map(product);
    }

    @Override
    public void delete(Long id) throws RuntimeException {
        productRepository.deleteById(id);
    }

}