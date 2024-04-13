package com.day5.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.day5.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer> {

    
}
