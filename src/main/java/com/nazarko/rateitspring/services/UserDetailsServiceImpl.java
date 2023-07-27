package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.UserDAO;
import com.nazarko.rateitspring.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userDAO.findUserByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        return user;
    }
}
