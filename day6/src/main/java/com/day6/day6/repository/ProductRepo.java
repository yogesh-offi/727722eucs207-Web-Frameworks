package com.day6.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day6.day6.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

}
