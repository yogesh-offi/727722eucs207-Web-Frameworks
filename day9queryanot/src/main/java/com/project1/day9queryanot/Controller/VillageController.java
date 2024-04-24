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
import org.springframework.web.bind.annotation.RestController;

import com.project1.day9queryanot.Model.Village;
import com.project1.day9queryanot.Service.VillageService;

@RestController
public class VillageController {


    @Autowired
    VillageService VS;
    
    @GetMapping("/api/village/byname/{villageName}")
    public ResponseEntity<List<Village>> getByName(@PathVariable String villageName)
    {
        List<Village> V=VS.getByName(villageName);
        if(V!=null)
        return new ResponseEntity<>(V,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/village/bypopulation/{villagePopulation}")
    public ResponseEntity<List<Village>> getByPop(@PathVariable int villagePopulation)
    {
        List<Village> V=VS.getByPop(villagePopulation);
        if(V!=null)
        return new ResponseEntity<>(V,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/village/{villageId}")
    public ResponseEntity<Optional<Village>> getById(@PathVariable int villageId)
    {
        Optional<Village> V=VS.getById(villageId);
        if(V!=null)
        return new ResponseEntity<>(V,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/api/village")
    public ResponseEntity<Village> postdata(@RequestBody Village V)
    {
        Village V1=VS.postdata(V);
        if(V1!=null)
        return new ResponseEntity<>(V1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
