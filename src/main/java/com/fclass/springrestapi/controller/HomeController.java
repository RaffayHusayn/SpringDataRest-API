package com.fclass.springrestapi.controller;

import com.fclass.springrestapi.model.Author;
import com.fclass.springrestapi.model.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/api/authors/younger/{age}")//the base api property doesn't apply here so to query it we must do:
    //localhost:8080/api/authors/younger/21
    public List<Author> getAuthorYoungerThan(@PathVariable int age){

        return authorRepository.getAuthorByAgeBefore(age);
    }
}
