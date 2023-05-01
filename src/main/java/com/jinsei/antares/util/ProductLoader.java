package com.jinsei.antares.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jinsei.antares.model.Product;
import com.jinsei.antares.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@Component
public class ProductLoader {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    void loadProducts() {
        List<Product> products = new ArrayList<>(List.of(
                new Product("quartz-watch", 6.22),
                new Product("engineering-journal", 5.99),
                new Product("samsung-bud-pro", 45.00),
                new Product("hx-drone", 110.56),
                new Product("logitech-mouse-g9", 20.99),
                new Product("lavender-incense-lantern", 3.99),
                new Product("mug-xl", 0.5),
                new Product("oraimo-power-bank", 9.99),
                new Product("key-chain", 1.00),
                new Product("chessboard", 8.00)));

        productRepository.saveAll(products);
    }

}
