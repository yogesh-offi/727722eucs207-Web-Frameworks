package com.day4q2.day4q2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4q2.day4q2.model.Job;
import com.day4q2.day4q2.repository.JobRepo;
import com.day4q2.day4q2.service.JobService;

@RestController
public class Jobcontroller {

    @Autowired
    JobService j;
    @Autowired
    JobRepo jr;
    @PostMapping(path = "/api/job")
    public Job saveData(@RequestBody Job jb)
    {
        return j.saveMedicine(jb);
    }
    @GetMapping("/api/job")
    public List<Job> dis()
    {
        return jr.findAll();
    }
    @GetMapping("/api/job/{jobId}")
    public Optional<Job> show(@PathVariable int jobId)
    {
        return jr.findById(jobId);
    }
}
