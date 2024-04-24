package com.project1.day8startswithendswith.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day8startswithendswith.Model.Student1;
import com.project1.day8startswithendswith.Repository.StudentRepo;

@Service
public class StudentService
{
    @Autowired
    StudentRepo SR;

    public List<Student1> getGreater(int a)
    {
        return SR.getMarksGreater(a);
    }

    public List<Student1> getLesser(int a)
    {
        return SR.getMarksLesser(a);
    }

    public Student1 postdata(Student1 S)
    {
        return SR.save(S);
    }
    
}
