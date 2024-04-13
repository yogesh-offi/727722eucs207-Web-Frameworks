package com.day4pah.day4pah.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day4pah.day4pah.model.Book;
import com.day4pah.day4pah.repository.BookRepo;

@Service
public class BookService {

    @Autowired
    BookRepo br;

    public Book savedata(@RequestBody Book b)
    {
        return br.save(b);
    }

    public List<Book> display()
    {
        return br.findAll();
    }

    public Optional<Book> findById(int id)
    {
        return br.findById(id);
    }
}
