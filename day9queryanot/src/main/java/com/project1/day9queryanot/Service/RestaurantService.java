package com.project1.day9queryanot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day9queryanot.Model.Restaurant;
import com.project1.day9queryanot.Repository.RestaurantRepo;

@Service
public class RestaurantService 
{
    @Autowired
    RestaurantRepo RR;

    public Restaurant postdata(Restaurant R)
    {
        return RR.save(R);
    }

    public List<Restaurant> getByCapacity(int capacity)
    {
        return RR.getByCapacity(capacity);
    }

    public Optional<Restaurant> getById(int id)
    {
        return RR.findById(id);
    }

    public Restaurant getByName(String name)
    {
        return RR.getByName(name);
    }
}
