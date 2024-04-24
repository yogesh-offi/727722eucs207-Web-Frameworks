package com.project1.day9queryanot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day9queryanot.Model.Person2;
import com.project1.day9queryanot.Repository.Personrepo;

@Service
public class PersonService 
{
    @Autowired
    Personrepo PR;

    public List<Person2> getByAge(int age)
    {
        return PR.getByAge(age);
    }

    public Person2 postdata(Person2 P)
    {
        return PR.save(P);
    }

}
