package com.project.demo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class model {
    @GetMapping("/Yogesh")
    public String Controller()
    {
        return "Hello gud mornin";
    }
}
