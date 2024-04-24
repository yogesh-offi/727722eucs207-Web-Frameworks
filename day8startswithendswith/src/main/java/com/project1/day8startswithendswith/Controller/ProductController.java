package com.project1.day8startswithendswith.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day8startswithendswith.Model.Product1;
import com.project1.day8startswithendswith.Service.ProductService;

@RestController
public class ProductController 
{
    @Autowired
    ProductService PS;

    @GetMapping("/product/distinct/startwith/{name}")
    public ResponseEntity<List<Product1>> getBySW(@PathVariable String name)
    {
        List<Product1> P=PS.getBySW(name);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/product/distinct/endwith/{name}")
    public ResponseEntity<List<Product1>> getByEW(@PathVariable String name)
    {
        List<Product1> P=PS.getByEW(name);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/product/sortBy/price")
    public ResponseEntity<List<Product1>> getWithSort()
    {
        List<Product1> P=PS.getBySort();
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/product")
    public ResponseEntity<Product1> postdata(@RequestBody Product1 P)
    {
        Product1 P1=PS.postdata(P);
        if(P1!=null)
        return new ResponseEntity<>(P1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
