package com.project1.day7queryusingjpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day7queryusingjpa.Model.Course;
import com.project1.day7queryusingjpa.Service.CourseService;

@RestController
public class CourseController 
{
    @Autowired
    CourseService CS;

    @GetMapping("/api/course")
    public ResponseEntity<List<Course>> getAll()
    {
        List<Course> C=CS.getAll();
        if(C!=null)
        return new ResponseEntity<>(C,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<Course>> getByCN(@PathVariable String courseName)
    {
        List<Course> C=CS.getByCourse(courseName);
        if(C!=null)
        return new ResponseEntity<>(C,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @PostMapping("/api/course")
    public ResponseEntity<Course> postdata(@RequestBody Course C)
    {
        Course C1=CS.postdata(C);
        if(C1!=null)
        return new ResponseEntity<>(C1,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
