package com.day5.day5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day5.day5.model.Employee;
import com.day5.day5.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo er;

    public Employee saveall(@RequestBody Employee e)
    {
        return er.save(e);
    }

    public Employee update(@RequestBody Employee e)
    {
        return er.save(e);
    }

    public void delete(int id)
    {
        er.deleteById(id);
    }
}
