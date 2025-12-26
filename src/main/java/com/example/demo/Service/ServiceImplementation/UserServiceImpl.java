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
        return user;
    }

    @Override
    public String login(User user) {
        return "Login successful";
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User findByEmail(String email) {
        return new User();
    }

    @Override
    public User findById(Long id) {
        return new User();
    }
}
