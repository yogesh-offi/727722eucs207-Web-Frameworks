package com.project1.day7queryusingjpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day7queryusingjpa.Model.Product;
import com.project1.day7queryusingjpa.Service.ProductService;

@RestController
public class ProductController 
{
    @Autowired
    ProductService PS;

    @GetMapping("/api/product")
    public ResponseEntity<List<Product>> getAll()
    {
        List<Product> L=PS.getAll();
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/product/{productCategory}")
    public ResponseEntity<List<Product>> getAllByProductCategory(@PathVariable String productCategory)
    {
        List<Product> L=PS.getByProductCate(productCategory);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/product/{priceCategory}")
    public ResponseEntity<List<Product>> getAllByPriceCategory(@PathVariable String priceCategory)
    {
        List<Product> L=PS.getByPriceCate(priceCategory);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
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
