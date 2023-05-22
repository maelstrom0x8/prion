package com.antares.jinsei.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.jinsei.antares.productmanager.service.ProductService;
import com.jinsei.antares.web.controller.ProductController;

@WebMvcTest(controllers = ProductController.class)
public class ProductControllerTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ProductService productService;

	
	
}
