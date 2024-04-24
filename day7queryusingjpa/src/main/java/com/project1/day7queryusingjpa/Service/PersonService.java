package com.project1.day7queryusingjpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day7queryusingjpa.Model.Person;
import com.project1.day7queryusingjpa.Repository.PersonRepo;

@Service
public class PersonService 
{

    @Autowired
    PersonRepo PR;

    public List<Person> getAll()
    {
        return PR.findAll();
    }

    public Person postdata(Person P)
    {
        return PR.save(P);
    }

    public List<Person> getByAge(int age)
    {
        return PR.getByAge(age);
    }

    public List<Person> JoinTwoTables()
    {
        return PR.getByLeftJoin();
    }

}
