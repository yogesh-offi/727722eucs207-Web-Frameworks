package com.project1.day9queryanot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day9queryanot.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> 
{
    @Query("select U from User U where U.username= :name")
    User getByName(String name);
}
