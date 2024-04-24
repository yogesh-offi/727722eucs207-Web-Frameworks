package com.project1.day9queryanot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day9queryanot.Model.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer>
{
    @Query("Select R from Restaurant R where R.restaurantName = :name")
    Restaurant getByName(String name);

    @Query("Select R from Restaurant R where R.capacity = :capacity")
    List<Restaurant> getByCapacity(int capacity);
}
