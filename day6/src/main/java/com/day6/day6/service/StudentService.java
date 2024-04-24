package com.day6.day6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.day6.model.Student;
import com.day6.day6.repository.StudentRepo;


@Service
public class StudentService 
{
    @Autowired
    StudentRepo SR;

    public Page<Student> getAll(int pn,int ps)
    {
        Pageable p=PageRequest.of(pn, ps);
        return SR.findAll(p);
    }

    public Page<Student> getAllWithSort(int pn,int ps,String s)
    {
        Pageable p=PageRequest.of(pn, ps, Sort.by(s).ascending());
        return SR.findAll(p);
    }

    public Student postdata(Student S)
    {
        return SR.save(S);
    }
}
