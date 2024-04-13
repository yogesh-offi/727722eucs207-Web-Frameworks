package com.pah1.pah1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pah1.pah1.model.Student;
import com.pah1.pah1.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @PostMapping("/student")
    public Student savedata(@RequestBody Student s) {
        return ss.savedata(s);
    }

    @GetMapping("/student")
    public List<Student> getdata() {
        return ss.getdata();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> findid(@PathVariable int id) {
        return ss.findid(id);
    }

    @PutMapping("/student/{id}")
    public Student putdata(@PathVariable int id, @RequestBody Student s) {
        return ss.savedata(s);
    }

    @DeleteMapping("/student/{id}")
    public void deleteid(@PathVariable int id)
    {
         ss.delete(id);
    }
    
    
    

}
