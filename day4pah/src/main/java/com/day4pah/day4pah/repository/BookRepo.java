package com.day4pah.day4pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4pah.day4pah.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
