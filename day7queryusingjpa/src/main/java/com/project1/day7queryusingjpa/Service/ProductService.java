package com.project1.day7queryusingjpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day7queryusingjpa.Model.Product;
import com.project1.day7queryusingjpa.Repository.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    ProductRepo PR;

    public List<Product> getAll()
    {
        return PR.findAll();
    }

    public List<Product> getByProductCate(String a)
    {
        return PR.getByProductCategory(a);
    }

    public List<Product> getByPriceCate(String a)
    {
        return PR.getByPriceCategory(a);
    }

    public Product postdata(Product P)
    {
        return PR.save(P);
    }
    
}
