package com.project1.day8startswithendswith.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day8startswithendswith.Model.Person1;

@Repository
public interface PersonRepo extends JpaRepository<Person1,Integer> 
{
    @Query("select P from Person1 P where P.fname like :name%")
    List<Person1> getByStartingWith(String name);

    @Query("select P from Person1 P where P.fname like %:name")
    List<Person1> getByEndsWith(String name);
    
    @Query("select P from Person1 P where P.lname not = :name")
    List<Person1> getByLastNameNot(String name);

    @Query("select P from Person1 P where P.age not in :age")
    List<Person1> getByAgeNotIn(int age);

}
