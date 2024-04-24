package com.project1.day9queryanot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day9queryanot.Model.Recipe;
import com.project1.day9queryanot.Service.RecipeService;

@RestController
public class RecipeController 
{
    @Autowired
    RecipeService RS;

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<Recipe>> getByName(@RequestParam String name)
    {
        List<Recipe> R=RS.getByName(name);
        if(R!=null)
        return new ResponseEntity<>(R,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<Optional<Recipe>> getById(@PathVariable int recipeId)
    {
        Optional<Recipe> R=RS.getById(recipeId);
        if(R!=null)
        return new ResponseEntity<>(R,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/api/recipe")
    public ResponseEntity<Recipe> postdata(@RequestBody Recipe R)
    {
        Recipe R1=RS.postdata(R);
        if(R1!=null)
        return new ResponseEntity<>(R1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
