package com.project.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.usecase.Usecase;

@RestController
public class Usecontrol {

    @GetMapping("/yogesh")  //endpoint 
   public Usecase controller()
   {
        Usecase u= new Usecase("Yogesh S", "727722EUCS207", "Web Frameworks", "Movies and Music", "Parotta", "I dont have luck with electronics object", "Job", "upgrade my skills", "Try to live peaceful",
        "Have fun, be kind, and laugh lots every day!");
        return u;
   }
}
