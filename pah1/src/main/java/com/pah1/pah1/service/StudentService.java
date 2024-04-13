package com.pah1.pah1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pah1.pah1.model.Student;
import com.pah1.pah1.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo sr;

    public Student savedata(Student s)
    {
        return sr.save(s);
    }
    public List<Student> getdata()
    {
        return sr.findAll();
    }
    public Optional<Student> findid(@PathVariable int id)
    {
        return sr.findById(id);
    }
   public void delete(@PathVariable int id)
   {
        sr.deleteById(id);
   }

}
