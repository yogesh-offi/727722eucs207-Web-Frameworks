package com.project1.day7queryusingjpa.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Course 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personId")
    Person P;

    private int creditHours,maxCapacity;

    private String courseName,preRequisites,enrolledStudents;

}
