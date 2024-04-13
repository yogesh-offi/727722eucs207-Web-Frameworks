package com.day5.day5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.day5.model.Product;
import com.day5.day5.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService ps;

    @PostMapping(path = "/api/product")
    public Product savethis(@RequestBody Product e)
    {
        return ps.saveall(e);
    }

    @PutMapping("/api/product/{productId}")
    public Product updateById(@RequestBody Product e)
    {
        return ps.update(e);
    }

    @DeleteMapping("/api/product/{productId}")
    public void deleteById(@PathVariable int productId)
    {
        ps.delete(productId);
    }
}
