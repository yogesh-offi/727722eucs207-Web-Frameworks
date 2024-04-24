package com.project1.day7queryusingjpa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day7queryusingjpa.Model.Door;
import com.project1.day7queryusingjpa.Repository.DoorRepo;

@Service
public class DoorService 
{
    @Autowired
    DoorRepo DR;

    public List<Door> getAll()
    {
        return DR.findAll();
    }

    public Optional<Door> getByID(int id)
    {
        return DR.findById(id);
    }

    public Door postdata(Door D)
    {
        return DR.save(D);
    }

    public List<Door> getByAT(String A)
    {
        return DR.getBYAccessType(A);
    }
}
