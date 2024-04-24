package com.project1.day7queryusingjpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day7queryusingjpa.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>
{
    @Query("select P from Product P where priceCategory = :pC")
    List<Product> getByPriceCategory(String pC);

    @Query("select P from Product P where productCategory = :pC")
    List<Product> getByProductCategory(String pC);

    
}
