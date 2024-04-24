package com.project1.day9queryanot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day9queryanot.Model.Village;
import com.project1.day9queryanot.Repository.VillageRepo;

@Service
public class VillageService 
{
    @Autowired
    VillageRepo VR;

    public List<Village> getByName(String name)
    {
        return VR.getByName(name);
    }

    public List<Village> getByPop(int pop)
    {
        return VR.getByPopulation(pop);
    }

    public Optional<Village> getById(int id)
    {
        return VR.findById(id);
    }

    public Village postdata(Village V)
    {
        return VR.save(V);
    }
    
}
