package com.project1.day7queryusingjpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day7queryusingjpa.Model.Course;
import com.project1.day7queryusingjpa.Repository.CourseRepo;

@Service
public class CourseService 
{
    @Autowired
    CourseRepo CR;

    public List<Course> getAll()
    {
        return CR.findAll();
    }

    public Course postdata(Course C)
    {
        return CR.save(C);
    }

    public List<Course> getByCourse(String CN)
    {
        return CR.getByCN(CN);
    }

}
