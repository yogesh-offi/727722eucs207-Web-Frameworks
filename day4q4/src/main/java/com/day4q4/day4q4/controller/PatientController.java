package com.day4q4.day4q4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4q4.day4q4.model.Patient;
import com.day4q4.day4q4.service.PatientService;

@RestController
public class PatientController {
    @Autowired
    PatientService ps;

    @PostMapping(path = "/api/patient")
    public Patient saveall(@RequestBody Patient p)
    {
        return ps.saveall(p);
    }

    @GetMapping("/api/patient")
    public List<Patient> findall()
    {
        return ps.findallp();
    }

    @GetMapping("/api/patient/{patientId}")
    public Optional<Patient> getbyid(@PathVariable int patientId)
    {
        return ps.getbyid(patientId);
    }
}
