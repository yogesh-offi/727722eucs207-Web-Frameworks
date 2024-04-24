package com.day6.day6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day6.day6.model.Student;
import com.day6.day6.service.StudentService;



@RestController
public class StudentController 
{
    @Autowired
    StudentService SS;

    @GetMapping("/api/student")
    public Page<Student> getAll(@RequestParam(defaultValue = "0") int pn,@RequestParam(defaultValue = "3") int ps)
    {
        return SS.getAll(pn, ps);
    }

    @GetMapping("/api/student/sort")
    public Page<Student> getAllBySort(@RequestParam(defaultValue = "0") int pn,@RequestParam(defaultValue = "3") int ps,@RequestParam(defaultValue = "id") String S)
    {
        return SS.getAllWithSort(pn, ps, S);
    }

    @PostMapping("/api/student")
    public Student postdata(@RequestBody Student S)
    {
        return SS.postdata(S);
    }
}
