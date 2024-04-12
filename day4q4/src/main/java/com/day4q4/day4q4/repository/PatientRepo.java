package com.day4q4.day4q4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4q4.day4q4.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer> {

}
