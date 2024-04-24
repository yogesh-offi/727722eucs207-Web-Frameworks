package com.project1.day9queryanot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day9queryanot.Model.Person2;
import com.project1.day9queryanot.Service.PersonService;

@RestController
public class PersonController 
{
    @Autowired
    PersonService PS;

    @GetMapping("/api/person/byAge/{age}")
    public ResponseEntity<List<Person2>> getByAge(@PathVariable int age)
    {
        List<Person2> P=PS.getByAge(age);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/api/person")
    public ResponseEntity<Person2> postdata(@RequestBody Person2 P)
    {
        Person2 P1=PS.postdata(P);
        if(P1!=null)
        return new ResponseEntity<>(P1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
