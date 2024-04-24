package com.day6.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.day6.model.Employee;
import com.day6.day6.repository.EmployeeRepo;


@Service
public class EmployeeService 
{
    @Autowired
    EmployeeRepo ER;

    public List<Employee> getBySort(String S)
    {
        return ER.findAll(Sort.by(S).ascending());
    }

    public Page<Employee> getByPage(int os,int ps)
    {
        return ER.findAll(PageRequest.of(os,ps));
    }

    public Page<Employee> getByPageAndSort(int os,int ps,String S)
    {
        return ER.findAll(PageRequest.of(os, ps,Sort.by(S).ascending()));
    }

    public Employee postdata(Employee E)
    {
        return ER.save(E);
    }
}
