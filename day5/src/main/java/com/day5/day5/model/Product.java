package com.day5.day5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int productId;
    public String productName;
    public String productdescription;
    public int getProductId() {
        return productId;
    }
    public Product(int productId, String productName, String productdescription) {
        this.productId = productId;
        this.productName = productName;
        this.productdescription = productdescription;
    }
    public Product()
    {}
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductdescription() {
        return productdescription;
    }
    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }
    
}

