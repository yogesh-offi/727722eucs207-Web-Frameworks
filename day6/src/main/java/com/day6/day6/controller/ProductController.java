package com.day6.day6.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day6.day6.model.Product;
import com.day6.day6.service.ProductService;



@RestController
public class ProductController 
{
    @Autowired
    ProductService PS;

    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<Page<Product>> getAsPage(@PathVariable int offset,@PathVariable int pagesize)
    {
        Page<Product> P=PS.getByPage(offset, pagesize);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Product>> getWithSort(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        Page<Product> P=PS.getAllByPageAndSort(offset, pagesize, field);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Optional<Product>> getById(@PathVariable int productId)
    {
        Optional<Product> P=PS.getById(productId);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/product")
    public ResponseEntity<Product> postdata(@RequestBody Product P)
    {
        Product P1=PS.postdata(P);
        if(P1!=null)
        return new ResponseEntity<>(P1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
