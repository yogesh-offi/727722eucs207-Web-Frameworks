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

import com.day6.day6.model.Children;
import com.day6.day6.service.ChildrenService;


@RestController
public class ChildrenController 
{
    @Autowired
    ChildrenService CS;

    @GetMapping("/api/children/sortBy/{field}")
    public ResponseEntity<List<Children>> getWithSort(@PathVariable String field)
    {
        List<Children> L=CS.getAllBySort(field);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<Page<Children>> getBypspn(@PathVariable int offset,@PathVariable int pagesize)
    {
        Page<Children> L=CS.getAllByOffandPS(offset, pagesize);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Children>> getBypspn(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        Page<Children> L=CS.getAll(offset, pagesize, field);
        if(L!=null)
        return new ResponseEntity<>(L,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/children")
    public ResponseEntity<Children> postData(@RequestBody Children C)
    {
        Children C1=CS.postdata(C);
        if(C1!=null)
        return new ResponseEntity<>(C1,HttpStatus.CREATED);
        else return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
