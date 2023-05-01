package com.jinsei.antares.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jinsei.antares.dto.ProductDTO;
import com.jinsei.antares.model.Product;
import com.jinsei.antares.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::fromProduct)
                .collect(Collectors.toList());
    }

    private ProductDTO fromProduct(Product product) {
        return new ProductDTO(product.getId(),
                product.getName(), product.getPrice(), product.getCreatedOn());
    }

}
