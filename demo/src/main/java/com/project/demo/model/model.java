package com.project.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.response.Response;

@RestController
public class model {
    @Value("${myname.name}")  //to define the name of an application
    private String myname;

    @GetMapping("/welcome")  //endpoint 
    public Response Controller()
    {
        Response r = new Response(1, "yogesh", "s");  //obj for response class
        return r;
    }
}
