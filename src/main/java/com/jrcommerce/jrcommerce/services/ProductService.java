package com.jrcommerce.jrcommerce.services;

import java.util.List;

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

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> new ProductDTO(product)).toList();
    }
}
