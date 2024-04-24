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

import com.project1.day8startswithendswith.Model.Student1;
import com.project1.day8startswithendswith.Service.StudentService;

@RestController
public class StudentController 
{
    @Autowired
    StudentService SS;

    @PostMapping("/student")
    public ResponseEntity<Student1> postdata(@RequestBody Student1 S)
    {
        Student1 S1=SS.postdata(S);
        if(S1!=null)
        return new ResponseEntity<>(S1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/student/marksGreaterThan/{mark}")
    public ResponseEntity<List<Student1>> getGM(@PathVariable int mark)
    {
        List<Student1> S=SS.getGreater(mark);
        if(S!=null)
        return new ResponseEntity<>(S,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/student/marksLessThan/{mark}")
    public ResponseEntity<List<Student1>> getLM(@PathVariable int mark)
    {
        List<Student1> S=SS.getLesser(mark);
        if(S!=null)
        return new ResponseEntity<>(S,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
