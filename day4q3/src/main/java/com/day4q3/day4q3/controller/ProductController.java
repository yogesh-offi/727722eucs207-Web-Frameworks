package com.day4q3.day4q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4q3.day4q3.model.Product;
import com.day4q3.day4q3.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService ps;

    @PostMapping(path = "/api/insert")
    public Product insert(@RequestBody Product p)
    {
        return ps.savedata(p);
    }

    @GetMapping("/api/insert")
    public List<Product> getAll()
    {
        return ps.getAll();
    }

    @GetMapping("/api/insert/{productId}")
    public Optional<Product> getId(@PathVariable int productId)
    {
        return ps.getId(productId);
    }
}
