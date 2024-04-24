package com.project1.day9queryanot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day9queryanot.Model.User;
import com.project1.day9queryanot.Repository.UserRepo;

@Service
public class UserService 
{
    @Autowired
    UserRepo UR;

    public Optional<User> getById(int id)
    {
        return UR.findById(id);
    }

    public User getByUsername(String name)
    {
        return UR.getByName(name);
    }

    public User postdata(User U)
    {
        return UR.save(U);
    }
}
