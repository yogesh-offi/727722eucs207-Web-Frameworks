package com.day4pah.day4pah.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4pah.day4pah.model.Book;
import com.day4pah.day4pah.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService bs;

    @PostMapping(path = "/api/book")
    public Book savedata(@RequestBody Book b)
    {
        return bs.savedata(b);
    }

    @GetMapping("/api/book")
    public List<Book> display()
    {
        return bs.display();
    }

    @GetMapping("/api/book/{bookId}")
    public Optional<Book> findById(@PathVariable int bookId)
    {
        return bs.findById(bookId);
    }

    

}
