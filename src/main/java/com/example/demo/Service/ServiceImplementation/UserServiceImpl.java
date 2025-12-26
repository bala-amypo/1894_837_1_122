package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User register(User user) {
        if (user.getRole() == null) {
            user.setRole("USER");
        }
        // TODO: save user to DB
        return user;
    }

    @Override
    public String login(User user) {
        if (user.getEmail() == null || user.getPassword() == null) {
            throw new RuntimeException("Invalid credentials");
        }
        // TODO: validate email & password
        return "Login successful";
    }

    @Override
    public List<User> getAllUsers() {
        // TODO: fetch from DB
        return List.of();
    }
}
