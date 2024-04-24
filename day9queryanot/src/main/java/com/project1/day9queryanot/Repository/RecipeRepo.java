package com.project1.day9queryanot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day9queryanot.Model.Recipe;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer>
{
    @Query("select R from Recipe R where R.recipeName = :name")
    List<Recipe> getByName(String name);
    
}
