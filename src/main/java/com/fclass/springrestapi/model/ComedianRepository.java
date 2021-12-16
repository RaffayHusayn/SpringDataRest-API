package com.fclass.springrestapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "author" ,path = "author")
public interface ComedianRepository extends JpaRepository<Author, Integer> {

}
