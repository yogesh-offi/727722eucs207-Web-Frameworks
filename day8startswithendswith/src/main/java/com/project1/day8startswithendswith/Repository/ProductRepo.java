package com.project1.day8startswithendswith.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day8startswithendswith.Model.Product1;

@Repository
public interface ProductRepo extends JpaRepository<Product1,Integer> 
{

    @Query("Select P from Product1 P where P.productName like :name%")
    List<Product1> getByStartsWith(String name);

    @Query("Select P from Product1 P where P.productName like %:name")
    List<Product1> getByendsWith(String name);
    
}
