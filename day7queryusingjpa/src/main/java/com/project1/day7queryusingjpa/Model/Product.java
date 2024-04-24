package com.project1.day7queryusingjpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private int price;

    private String productName,productCategory,productDescription,priceCategory;
}
