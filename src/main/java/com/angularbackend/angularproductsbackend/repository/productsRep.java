package com.angularbackend.angularproductsbackend.repository;

import com.angularbackend.angularproductsbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productsInterface extends JpaRepository<Product,Long> {
}
