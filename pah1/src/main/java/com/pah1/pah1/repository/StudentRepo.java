package com.pah1.pah1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pah1.pah1.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
