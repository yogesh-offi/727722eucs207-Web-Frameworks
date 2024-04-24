package com.project1.day8startswithendswith.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day8startswithendswith.Model.Person1;
import com.project1.day8startswithendswith.Service.PersonService;

@RestController
public class PersonController 
{
    @Autowired
    PersonService PS;

    @PostMapping("/person")
    public ResponseEntity<Person1> postdata(@RequestBody Person1 P)
    {
        Person1 P1=PS.postdata(P);
        if(P1!=null)
        return new ResponseEntity<>(P1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<Person1>> getBySW(@PathVariable String value)
    {
        List<Person1> P=PS.getStartsWith(value);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<Person1>> getByEW(@PathVariable String value)
    {
        List<Person1> P=PS.getEndsWith(value);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/person/findByLastNameNot")
    public ResponseEntity<List<Person1>> getByLNN(@RequestParam String name)
    {
        List<Person1> P=PS.getLastNameNot(name);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/person/findByAgeNotIn")
    public ResponseEntity<List<Person1>> getByANI(@RequestParam int age)
    {
        List<Person1> P=PS.getAgeNotIn(age);
        if(P!=null)
        return new ResponseEntity<>(P,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
