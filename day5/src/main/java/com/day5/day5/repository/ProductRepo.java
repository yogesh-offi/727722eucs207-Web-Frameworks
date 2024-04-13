package com.day5.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.day5.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

    
}
