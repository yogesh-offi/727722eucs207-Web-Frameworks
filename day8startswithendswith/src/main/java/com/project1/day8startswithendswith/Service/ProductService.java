package com.project1.day8startswithendswith.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project1.day8startswithendswith.Model.Product1;
import com.project1.day8startswithendswith.Repository.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    ProductRepo PR;

    public List<Product1> getBySW(String a)
    {
        return PR.getByStartsWith(a);
    }

    public List<Product1> getByEW(String a)
    {
        return PR.getByendsWith(a);
    }

    public List<Product1> getBySort()
    {
        return PR.findAll(Sort.by("price").ascending());
    }

    public Product1 postdata(Product1 P)
    {
        return PR.save(P);
    }
}
