package com.project1.day7queryusingjpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day7queryusingjpa.Model.Person;

@Repository
public interface PersonRepo  extends JpaRepository<Person,Integer>
{

    @Query("select p from Person p where age < :age")
    List<Person> getByAge(int age);

    
    @Query("select p,c from Person p join p.C c")
    List<Person> getByLeftJoin();

}
