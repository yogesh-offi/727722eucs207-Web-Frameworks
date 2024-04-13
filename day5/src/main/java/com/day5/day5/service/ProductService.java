package com.day5.day5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day5.day5.model.Product;
import com.day5.day5.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo pr;

    public Product saveall(@RequestBody Product e)
    {
        return pr.save(e);
    }

    public Product update(@RequestBody Product e)
    {
        return pr.save(e);
    }

    public void delete(int id)
    {
        pr.deleteById(id);
    }
}
