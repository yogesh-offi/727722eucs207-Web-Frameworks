package com.day4q4.day4q4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4q4.day4q4.model.Patient;
import com.day4q4.day4q4.repository.PatientRepo;

@Service
public class PatientService {

    @Autowired
    PatientRepo pr;
    
    public Patient saveall(Patient p)
    {
        return pr.save(p);
    }

    public List<Patient> findallp()
    {
        return pr.findAll();
    }

    public Optional<Patient> getbyid(int id)
    {
        return pr.findById(id);
    }
}
