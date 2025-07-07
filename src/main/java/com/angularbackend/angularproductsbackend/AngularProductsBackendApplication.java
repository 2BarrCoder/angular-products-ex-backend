package com.angularbackend.angularproductsbackend;

import com.angularbackend.angularproductsbackend.model.Product;
import com.angularbackend.angularproductsbackend.repository.productsRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AngularProductsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularProductsBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(productsRep productsRep) {
        return args -> {
            productsRep.save(new Product("Product 01", (float) 400.99, true));
            productsRep.save(new Product("Product 02", (float) 500.80, false));
            productsRep.save(new Product("Product 03", (float) 600.50, false));
            productsRep.save(new Product("Product 04", (float) 700.00, true));
            productsRep.save(new Product("Product 05", (float) 800.99, false));
        };
    }
}
