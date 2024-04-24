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
public class Person 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId")
    Course C;
    
    private String firstName,lastName,gender;
}
