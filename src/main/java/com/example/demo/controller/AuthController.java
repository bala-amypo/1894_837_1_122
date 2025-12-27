package com.example.demo.controller;

import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.LoginRequest;
import com.example.demo.model.User;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserService userService,
                          JwtUtil jwtUtil,
                          PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    // ✅ REGISTER
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    // ✅ LOGIN (TOKEN GENERATION)
    @PostMapping("/login")
public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {

    User user = userService.findByEmail(request.getEmail());

    // ✅ USER NOT FOUND
    if (user == null) {
        return ResponseEntity.status(401)
                .body(null);
    }

    // ✅ PASSWORD MISMATCH
    if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
        return ResponseEntity.status(401)
                .body(null);
    }

    String token = jwtUtil.generateToken(
            user.getEmail(),
            user.getRole(),
            user.getId()
    );

    AuthResponse response = new AuthResponse(
            token,
            user.getId(),
            user.getEmail(),
            user.getRole()
    );

    return ResponseEntity.ok(response);
}
}
