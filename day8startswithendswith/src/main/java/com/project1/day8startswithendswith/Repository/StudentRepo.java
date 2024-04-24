package com.project1.day8startswithendswith.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day8startswithendswith.Model.Student1;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Integer> 
{
    @Query("Select S from Student S where marks > :mark")
    List<Student1> getMarksGreater(int mark);

    @Query("Select S from Student S where marks < :mark")
    List<Student1> getMarksLesser(int mark);
}
