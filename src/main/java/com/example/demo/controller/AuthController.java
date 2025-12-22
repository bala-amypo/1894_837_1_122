//AuthController.java
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController //{

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // Register user
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    // Login user
    @PostMapping("/login")
    public User login(@RequestBody User request) {

        User user = userService.findByEmail(request.getEmail());

        if (user == null || !user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        return user; 
    }
}