package com.day4q3.day4q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.day4q3.day4q3.model.Product;
import com.day4q3.day4q3.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo repository;
    public Product savedata(@RequestBody Product p)
    {
        return repository.save(p);
    }

    public List<Product> getAll()
    {
        return repository.findAll();
    }
    
    public Optional<Product> getId(@PathVariable int Id)
    {
        return repository.findById(Id);
    }
}
