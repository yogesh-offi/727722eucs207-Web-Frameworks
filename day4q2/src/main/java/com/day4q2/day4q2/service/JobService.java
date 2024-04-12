package com.day4q2.day4q2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4q2.day4q2.model.Job;
import com.day4q2.day4q2.repository.JobRepo;

@Service
public class JobService {
    @Autowired
    private JobRepo repository;

    public Job saveMedicine(Job m)
    {
        return repository.save(m);
    }
}
