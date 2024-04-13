package com.day5.day5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day5.day5.model.Language;
import com.day5.day5.repository.LanguageRepo;

@Service
public class LanguageService {
    @Autowired
    LanguageRepo lr;

    public Language saveall(@RequestBody Language e)
    {
        return lr.save(e);
    }

    public Language update(@RequestBody Language e)
    {
        return lr.save(e);
    }

    public void delete(int id)
    {
        lr.deleteById(id);
    }
}
