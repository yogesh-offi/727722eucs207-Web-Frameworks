package com.day6.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day6.day6.model.Language;
import com.day6.day6.service.LanguageService;



@RestController
public class LanguageController 
{
    @Autowired
    LanguageService LS;

    @GetMapping("/api/language/sortBy/{field}")
    public ResponseEntity<List<Language>> getBySort(@PathVariable String field)
    {
        List<Language> L=LS.getBySorting(field);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/language/sortBy/{offset}/{pagesize}")
    public ResponseEntity<Page<Language>> getAsPage(@PathVariable int offset,@PathVariable int pagesize)
    {
        Page<Language> L=LS.getAsPage(offset, pagesize);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/language/sortBy/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Language>> getAsPagewithSorting(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String S)
    {
        Page<Language> L=LS.getAsPageWithSort(offset, pagesize, S);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/language")
    public ResponseEntity<Language> postdata(@RequestBody Language L)
    {
        Language L1=LS.postdata(L);
        if(L1!=null)
        return new ResponseEntity<>(L1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
