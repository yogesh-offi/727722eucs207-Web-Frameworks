package com.project1.day8startswithendswith.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day8startswithendswith.Model.Person1;
import com.project1.day8startswithendswith.Repository.PersonRepo;

@Service
public class PersonService 
{
    @Autowired
    PersonRepo PR;

    public List<Person1> getStartsWith(String a)
    {
        return PR.getByStartingWith(a);
    }

    public List<Person1> getLastNameNot(String a)
    {
        return PR.getByLastNameNot(a);
    }

    public List<Person1> getAgeNotIn(int a)
    {
        return PR.getByAgeNotIn(a);
    }

    public List<Person1> getEndsWith(String a)
    {
        return PR.getByEndsWith(a);
    }
    
    public Person1 postdata(Person1 P)
    {
        return PR.save(P);
    }
}
