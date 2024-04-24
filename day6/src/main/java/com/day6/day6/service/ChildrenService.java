package com.day6.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.day6.model.Children;
import com.day6.day6.repository.ChildrenRepo;


@Service
public class ChildrenService 
{
    @Autowired
    ChildrenRepo CR;

    public List<Children> getAllBySort(String S)
    {
        return CR.findAll(Sort.by(S).ascending());
    } 

    public Page<Children> getAllByOffandPS(int os,int ps)
    {
        return CR.findAll(PageRequest.of(os, ps));
    }

    public Page<Children> getAll(int os,int ps,String S)
    {
        return CR.findAll(PageRequest.of(os, ps,Sort.by(S).ascending()));
    }

    public Children postdata(Children C)
    {
        return CR.save(C);
    }
}
