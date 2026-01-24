package com.jrcommerce.jrcommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrcommerce.jrcommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
