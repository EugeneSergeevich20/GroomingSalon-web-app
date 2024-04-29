package com.example.groomingsalonwebapp.service;

import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.repository.UserRepository;
import com.example.groomingsalonwebapp.security.UserDetailsImpl;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);

        if (user.isEmpty()){
            throw  new UsernameNotFoundException("Пользователь с таким логином не найден!");
        }

        return new UserDetailsImpl(user.get());
    }

    public User getAuthUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDerails;

        if (authentication instanceof AnonymousAuthenticationToken)
            return null;
        else
            userDerails = (UserDetailsImpl) authentication.getPrincipal();
        return userDerails.getUser();
    }
}
