package com.project1.day9queryanot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day9queryanot.Model.Restaurant;
import com.project1.day9queryanot.Service.RestaurantService;

@RestController
public class RestaurantController 
{
    @Autowired
    RestaurantService RS;

    @GetMapping("/api/restaurant/{restaurantId}")
    public ResponseEntity<Optional<Restaurant>> getById(@PathVariable int restaurantId)
    {
        Optional<Restaurant> R=RS.getById(restaurantId);
        if(R!=null)
        return new ResponseEntity<>(R,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/restaurant/byName/{restaurantName}")
    public ResponseEntity<Restaurant> getByName(@PathVariable String restaurantName)
    {
        Restaurant R=RS.getByName(restaurantName);
        if(R!=null)
        return new ResponseEntity<>(R,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/restaurant/capacity/{capacity}")
    public ResponseEntity<List<Restaurant>> getByCapacity(@PathVariable int capacity)
    {
        List<Restaurant> R=RS.getByCapacity(capacity);
        if(R!=null)
        return new ResponseEntity<>(R,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/api/restaurant")
    public ResponseEntity<Restaurant> postdata(@RequestBody Restaurant R)
    {
        Restaurant R1=RS.postdata(R);
        if(R1!=null)
        return new ResponseEntity<>(R1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
