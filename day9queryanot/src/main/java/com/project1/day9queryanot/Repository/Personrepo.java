package com.project1.day9queryanot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day9queryanot.Model.Person2;

@Repository
public interface Personrepo extends JpaRepository<Person2,Integer> 
{
    @Query("Select P from Person2 P where P.age < :age")
    List<Person2> getByAge(int age);
}
