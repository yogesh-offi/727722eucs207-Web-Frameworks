package com.project1.day7queryusingjpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day7queryusingjpa.Model.Person;
import com.project1.day7queryusingjpa.Service.PersonService;

@RestController
public class PersonController 
{


    @Autowired
    PersonService PS;

    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getAll()
    {
        List<Person> P=PS.getAll();
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<Person>> getAllByAge(@RequestParam int age)
    {
        List<Person> P=PS.getByAge(age);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("/api/person")
    public ResponseEntity<Person> postdata(@RequestBody Person P)
    {
        Person P1=PS.postdata(P);
        if(P1!=null)
        return new ResponseEntity<>(P1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/person/join")
    public List<Person> getByJoin()
    {
        return PS.JoinTwoTables();
    }


}
