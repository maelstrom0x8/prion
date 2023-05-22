package com.jinsei.antares.productmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinsei.antares.productmanager.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    
}
