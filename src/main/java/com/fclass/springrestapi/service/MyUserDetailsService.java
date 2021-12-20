package com.fclass.springrestapi.service;

import com.fclass.springrestapi.model.RestUser;
import com.fclass.springrestapi.model.RestUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    RestUserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        RestUser user = repo.findRestUserByUsername(username);
        return new UserPrincipal(user);

    }
}
