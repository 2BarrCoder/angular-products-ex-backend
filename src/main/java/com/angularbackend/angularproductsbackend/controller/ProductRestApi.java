package com.angularbackend.angularproductsbackend.controller;

import com.angularbackend.angularproductsbackend.model.Product;
import com.angularbackend.angularproductsbackend.repository.productsRep;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")

public class ProductRestApi {
    private productsRep productsRep;

    ProductRestApi(productsRep productsRep) {
        this.productsRep = productsRep;
    }

    @GetMapping("/products")
    List<Product> getAllProducts(Model model){
        return this.productsRep.findAll();
    }

    @GetMapping("/product/{id}")
    Product getProduct(@PathVariable int id){
        Product byId = this.productsRep.findById(id).get();
        return byId;
    }

    @Transactional
    @DeleteMapping("/products/{id}")
    void deleteProduct(@PathVariable int id) {
        try {
            Product product = getProduct(id);
            this.productsRep.delete(product);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
