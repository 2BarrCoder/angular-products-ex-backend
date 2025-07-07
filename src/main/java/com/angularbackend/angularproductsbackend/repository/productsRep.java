package com.angularbackend.angularproductsbackend.repository;

import com.angularbackend.angularproductsbackend.model.Product;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface productsRep extends JpaRepository<Product,Integer> {

}
