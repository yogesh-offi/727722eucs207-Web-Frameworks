package com.project1.day7queryusingjpa.Controller;

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

import com.project1.day7queryusingjpa.Model.Door;
import com.project1.day7queryusingjpa.Service.DoorService;

@RestController
public class DoorController 
{
    @Autowired
    DoorService DS;

    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> getAll()
    {
        List<Door> D=DS.getAll();
        if(DS!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else 
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/door/accesstype/{accessType}")
    public ResponseEntity<List<Door>> getBYAT(@PathVariable String accessType)
    {
        List<Door> D=DS.getByAT(accessType);
        if(DS!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else 
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<Optional<Door>> getByID(@PathVariable int doorId)
    {
        Optional<Door> D=DS.getByID(doorId);
        if(DS!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else 
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/api/door")
    public ResponseEntity<Door> postdata(@RequestBody Door D)
    {
        Door D1=DS.postdata(D);
        if(D1!=null)
        return new ResponseEntity<>(D1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
