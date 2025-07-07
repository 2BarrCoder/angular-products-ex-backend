package com.angularbackend.angularproductsbackend.controller;
import com.angularbackend.angularproductsbackend.model.Product;
import com.angularbackend.angularproductsbackend.repository.productsRep;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductsController {
    private productsRep productsRep;

    ProductsController(productsRep productsRep) {
        this.productsRep = productsRep;
    }

    @GetMapping("/prod")
    List<Product> getAllProducts(Model model){
        /*List<Product> products = this.productsRep.findAll();*/
        /*model.addAttribute("products", products);
        return "products";*/
        return this.productsRep.findAll();
    }

    @DeleteMapping("/prod{id}")
    void DeleteProduct(Model model , @RequestParam(name = "id") int id){
       /* this.productsRep.deleteById((long) id);
        return "redirect:/prod";*/
        this.productsRep.deleteById( id);
    }

}
