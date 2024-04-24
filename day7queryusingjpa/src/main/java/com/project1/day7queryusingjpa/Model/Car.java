package com.project1.day7queryusingjpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;

    private int owners;
    private long mobile;

    private String carName,carType,currentOwnerName,address;
}
