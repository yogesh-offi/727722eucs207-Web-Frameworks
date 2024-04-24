package com.day6.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day6.day6.model.Language;



@Repository
public interface LanguageRepo extends JpaRepository<Language,Integer>{

}
