package com.project1.day9queryanot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person2 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private int age;

    private String firstname,lastname,gender,email;
}
