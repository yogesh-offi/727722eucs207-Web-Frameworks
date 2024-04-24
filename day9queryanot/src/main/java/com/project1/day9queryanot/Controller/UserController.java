package com.project1.day9queryanot.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day9queryanot.Model.User;
import com.project1.day9queryanot.Service.UserService;

@RestController
public class UserController 
{
    @Autowired
    UserService US;

    @GetMapping("/api/user/{userId}")
    public ResponseEntity<Optional<User>> getById(@PathVariable int userId)
    {
        Optional<User> U=US.getById(userId);
        if(U!=null)
        return new ResponseEntity<>(U,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/user/byName/{username}")
    public ResponseEntity<User> getByusername(@PathVariable String username)
    {
        User U=US.getByUsername(username);
        if(U!=null)
        return new ResponseEntity<>(U,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @PostMapping("/api/user")
    public ResponseEntity<User> postdata(@RequestBody User U)
    {
        User U1=US.postdata(U);
        if(U1!=null)
        return new ResponseEntity<>(U1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
