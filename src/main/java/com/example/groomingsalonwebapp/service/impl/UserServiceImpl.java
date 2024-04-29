package com.example.groomingsalonwebapp.service.impl;

import com.example.groomingsalonwebapp.model.Role;
import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.repository.UserRepository;
import com.example.groomingsalonwebapp.service.UserDetailsServiceImpl;
import com.example.groomingsalonwebapp.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsServiceImpl userDetailsService;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, UserDetailsServiceImpl userDetailsService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
    }

    @Override
    public void register(User user) {

        User userReg = User.builder()
                .username(user.getUsername())
                .password(passwordEncoder.encode(user.getPassword()))
                .name(user.getName())
                .surname(user.getSurname())
                .phoneNumber(user.getPhoneNumber())
                .email(user.getEmail())
                .role(Role.ROLE_CLIENT)
                .build();

        userRepository.save(userReg);
    }

    @Override
    public User getAuthUser() {
        return userDetailsService.getAuthUser();
    }

    @Override
    public void updateUser(User userOld, User userUpdate) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }
}
