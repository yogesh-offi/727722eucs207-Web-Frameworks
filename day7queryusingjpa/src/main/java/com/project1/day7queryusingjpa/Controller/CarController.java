package com.project1.day7queryusingjpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day7queryusingjpa.Model.Car;
import com.project1.day7queryusingjpa.Service.CarService;

@RestController
public class CarController 
{
    @Autowired
    CarService CS;

    @GetMapping("/api/car")
    public ResponseEntity<List<Car>> getAll()
    {
        List<Car> C=CS.getAll();
        if(C!=null)
        return new ResponseEntity<>(C,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/car/distinct")
    public ResponseEntity<List<Car>> getByADDandCon(@RequestParam String currentOwnerName,@RequestParam String address)
    {
        List<Car> C=CS.getByAddandCon(currentOwnerName, address);
        if(C!=null)
        return new ResponseEntity<>(C,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/api/car")
    public ResponseEntity<Car> postdata(@RequestBody Car C)
    {
        Car C1=CS.postdata(C);
        if(C1!=null)
        return new ResponseEntity<>(C1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
