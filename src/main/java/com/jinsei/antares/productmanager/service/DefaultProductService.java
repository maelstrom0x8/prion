package com.jinsei.antares.productmanager.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinsei.antares.productmanager.dto.ProductDTO;
import com.jinsei.antares.productmanager.model.Product;
import com.jinsei.antares.productmanager.repository.ProductRepository;

@Service
class DefaultProductService implements ProductService {

    private final ProductRepository productRepository;

    public DefaultProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::fromProduct)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Optional<ProductDTO> addNewProduct(String name, Double price) {
        Product product = new Product(name, price);
        return Optional.ofNullable(fromProduct(product));
    }

    private ProductDTO fromProduct(Product product) {
        return new ProductDTO(product.getId(),
                product.getName(), product.getPrice(), product.getCreatedOn());
    }

}
