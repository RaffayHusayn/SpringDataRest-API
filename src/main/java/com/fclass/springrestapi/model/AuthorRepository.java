package com.fclass.springrestapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customauthors" ,path = "customauthors")
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    public List<Author> getAuthorByAgeBefore(int age);
}
