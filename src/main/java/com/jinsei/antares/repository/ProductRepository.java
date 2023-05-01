package com.jinsei.antares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinsei.antares.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    
}
