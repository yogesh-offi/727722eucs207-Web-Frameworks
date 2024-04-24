package com.project1.day7queryusingjpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day7queryusingjpa.Model.Car;
import com.project1.day7queryusingjpa.Repository.CarRepo;

@Service
public class CarService 
{
    @Autowired
    CarRepo CR;

    public List<Car> getAll()
    {
        return CR.findAll();
    }

    public Car postdata(Car C)
    {
        return CR.save(C);
    }

    public List<Car> getByAddandCon(String c,String A)
    {
        return CR.getByCONANDADD(c, A);
    }

}
