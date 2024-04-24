package com.project1.day9queryanot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day9queryanot.Model.Recipe;
import com.project1.day9queryanot.Repository.RecipeRepo;

@Service
public class RecipeService 
{
    @Autowired
    RecipeRepo RR;

    public List<Recipe> getByName(String name)
    {
        return RR.getByName(name);
    }

    public Recipe postdata(Recipe R)
    {
        return RR.save(R);
    }

    public Optional<Recipe> getById(int id)
    {
        return RR.findById(id);
    }
}
