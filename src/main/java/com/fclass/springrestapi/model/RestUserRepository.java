package com.fclass.springrestapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestUserRepository extends JpaRepository<RestUser, Integer> {
    RestUser findRestUserByUsername(String username);
}
