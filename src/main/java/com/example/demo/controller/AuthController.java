package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // ---------------- REGISTER ----------------
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    // ---------------- LOGIN ----------------
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.login(user);
    }

    // ---------------- GET ALL USERS ----------------
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // ---------------- GET USER BY EMAIL ----------------
    @GetMapping("/email/{email}")
    public User getByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    // ---------------- GET USER BY ID ----------------
    @GetMapping("/id/{id}")
    public User getById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
