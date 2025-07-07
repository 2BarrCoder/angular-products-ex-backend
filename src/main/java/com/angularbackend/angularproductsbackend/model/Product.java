package com.angularbackend.angularproductsbackend.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table (name = "products")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;
    @Column(name = "isSelected")
    private boolean isSelected;

    public Product(String name, float price, boolean isSelected) {
        this.name = name;
        this.price = price;
        this.isSelected = isSelected;

    }
}
