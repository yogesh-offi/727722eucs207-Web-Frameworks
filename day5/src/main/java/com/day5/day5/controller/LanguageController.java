package com.day5.day5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.day5.model.Language;
import com.day5.day5.service.LanguageService;

@RestController
public class LanguageController {
    @Autowired
    LanguageService ls;

    @PostMapping(path = "/api/language")
    public Language savethis(@RequestBody Language e)
    {
        return ls.saveall(e);
    }

    @PutMapping("/api/language")
    public Language updateById(@RequestBody Language e)
    {
        return ls.update(e);
    }

    @DeleteMapping("/api/employee/{languageId}")
    public void deleteById(@PathVariable int languageId)
    {
        ls.delete(languageId);
    }
}
