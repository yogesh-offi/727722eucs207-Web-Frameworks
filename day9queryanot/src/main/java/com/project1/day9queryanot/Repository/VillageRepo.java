package com.project1.day9queryanot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day9queryanot.Model.Village;

@Repository
public interface VillageRepo extends JpaRepository<Village,Integer> 
{
    @Query("Select V from Village V where V.villageName = :name")
    List<Village> getByName(String name);

    @Query("Select V from Village V where V.numOfPopulation = :pop")
    List<Village> getByPopulation(int pop);
}
