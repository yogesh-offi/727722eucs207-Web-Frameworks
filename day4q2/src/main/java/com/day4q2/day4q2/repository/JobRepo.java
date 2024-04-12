package com.day4q2.day4q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4q2.day4q2.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {

}
