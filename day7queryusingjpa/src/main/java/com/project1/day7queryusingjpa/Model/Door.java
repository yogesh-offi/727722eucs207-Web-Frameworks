package com.project1.day7queryusingjpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doorId;

    private String location,accessCode,accessType;

}
