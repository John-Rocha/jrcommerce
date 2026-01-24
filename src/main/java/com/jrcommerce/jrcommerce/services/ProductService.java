package com.jrcommerce.jrcommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrcommerce.jrcommerce.dto.ProductDTO;
import com.jrcommerce.jrcommerce.entities.Product;
import com.jrcommerce.jrcommerce.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(id).get();

        return new ProductDTO(product);
    }
}
