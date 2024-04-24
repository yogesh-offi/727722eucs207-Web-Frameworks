package com.day6.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day6.day6.model.Employee;
import com.day6.day6.service.EmployeeService;


@RestController
public class EmployeeController 
{
    @Autowired
    EmployeeService ES;

    @GetMapping("/api/employee/{field}")
    public ResponseEntity<List<Employee>> getBySort(@PathVariable String S)
    {
        List<Employee> E=ES.getBySort(S);
        if(E!=null)
        return new ResponseEntity<>(E,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/api/employee/{offset}/{pagesize}")
    public ResponseEntity<Page<Employee>> getByPage(@PathVariable int offset,@PathVariable int pagesize)
    {
        Page<Employee> E=ES.getByPage(offset, pagesize);
        if(E!=null)
        return new ResponseEntity<>(E,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/api/employee/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Employee>> getByPageandSort(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String S)
    {
        Page<Employee> E=ES.getByPageAndSort(offset, pagesize, S);
        if(E!=null)
        return new ResponseEntity<>(E,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/employee")
    public ResponseEntity<Employee> postdata(@RequestBody Employee E)
    {
        Employee E1=ES.postdata(E);
        if(E1!=null)
        return new ResponseEntity<>(E1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
