package com.day6.day6.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.day6.model.Product;
import com.day6.day6.repository.ProductRepo;



@Service
public class ProductService 
{
    @Autowired
    ProductRepo PR;

    public Page<Product> getByPage(int offset,int pagesize)
    {
        return PR.findAll(PageRequest.of(offset,pagesize));
    }

    public Page<Product> getAllByPageAndSort(int os,int ps,String S)
    {
        return PR.findAll(PageRequest.of(os,ps,Sort.by(S).ascending()));
    }

    public Optional<Product> getById(int id)
    {
        return  PR.findById(id);
    }

    public Product postdata(Product P)
    {
        return PR.save(P);
    }
}
