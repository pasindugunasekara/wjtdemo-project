package com.mycompany.jwtdemo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustoUserDetailService implements UserDetailsService {

    //this method actually does the validation for user existence
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        if (userName.equals("John")) { //here you can make db callwith help of repository and do validation
            return new User("John", "secret", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User does not exist");
        }
    }
}
