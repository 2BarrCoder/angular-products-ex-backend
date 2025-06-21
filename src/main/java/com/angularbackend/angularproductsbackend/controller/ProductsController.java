package com.angularbackend.angularproductsbackend.controller;
import com.angularbackend.angularproductsbackend.model.Product;
import com.angularbackend.angularproductsbackend.repository.productsRep;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private productsRep productsRep;

    Controller(productsRep productsRep) {
        this.productsRep = productsRep;
    }

    @GetMapping("/products")
    Product getAllProducts(Model model){
        List<Product> products = this.productsRep.findAll();
        model.addAttribute("products", products);
        return "products";
    }

}
