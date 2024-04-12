package com.day5.day5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.day5.model.Employee;
import com.day5.day5.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @PostMapping(path = "/api/employee")
    public Employee savethis(@RequestBody Employee e)
    {
        return es.saveall(e);
    }

    @PutMapping("/api/employee/{employeeId}")
    public Employee updateById(@RequestBody Employee e)
    {
        return es.update(e);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public void deleteById(@PathVariable int employeeId)
    {
        es.delete(employeeId);
    }
}
