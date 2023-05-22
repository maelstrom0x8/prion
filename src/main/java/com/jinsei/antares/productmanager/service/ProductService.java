package com.jinsei.antares.productmanager.service;

import java.util.List;
import java.util.Optional;

import com.jinsei.antares.productmanager.dto.ProductDTO;

public interface ProductService {

	List<ProductDTO> getAllProducts();

	Optional<ProductDTO> addNewProduct(String name, Double price);

}
