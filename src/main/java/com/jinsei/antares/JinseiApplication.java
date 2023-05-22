package com.jinsei.antares;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.jinsei.antares.productmanager.service.ProductService;

@SpringBootApplication
public class JinseiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JinseiApplication.class, args);
	}

	@Component
	class InitProductLoader implements CommandLineRunner {

		private final ProductService productService;

		public InitProductLoader(ProductService productService) {
			this.productService = productService;
		}

		@Override
		public void run(String... args) throws Exception {

			Map<String, Double> products = new HashMap<>();
			
			products.put("quartz-watch", 6.22);
			products.put("samsung-bud-pro", 45.00);
			products.put("hx-drone", 110.56);
			products.put("logitech-mouse-g9", 20.99);
			products.put("lavender-incense-lantern", 3.99);
			products.put("mug-xl", 0.5);
			products.put("oraimo-power-bank", 9.99);
			products.put("key-chain", 1.00);
			
			products.forEach((name, price) -> {
				productService.addNewProduct(name, price);
			});

		}

	}

}
