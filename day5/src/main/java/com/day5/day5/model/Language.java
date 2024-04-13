package com.day5.day5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int languageId;
    public String languageName;
    public String languageComplexity;
    public int getLanguageId() {
        return languageId;
    }
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    public Language(int languageId, String languageName, String languageComplexity) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.languageComplexity = languageComplexity;
    }
    public String getLanguageName() {
        return languageName;
    }
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    public String getLanguageComplexity() {
        return languageComplexity;
    }
    public void setLanguageComplexity(String languageComplexity) {
        this.languageComplexity = languageComplexity;
    }
    
    

}
