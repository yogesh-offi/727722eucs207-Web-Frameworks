package com.day6.day6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Language 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int languageId;

    private int languageCode;

    private String languageName,country;
}
