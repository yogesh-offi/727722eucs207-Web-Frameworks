package com.project1.day7queryusingjpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day7queryusingjpa.Model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer>
{

    @Query("select C from Car C where currentOwnerName = :con and address = :add")
    List<Car> getByCONANDADD(String con,String add);

}
