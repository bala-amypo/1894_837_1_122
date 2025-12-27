package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.UserService;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.LoginRequest;

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

    // ---------------- REGISTER ----------------
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {

        // Encode password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ADMIN");

        User savedUser = UserService.register(user);
        return ResponseEntity.ok(savedUser);
    }

    // ---------------- LOGIN (WITH DEBUG LOGS) ----------------
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {

        User user = userService.findByEmail(request.getEmail());

        // 🔍 DEBUG LOGS (STEP 3)
        System.out.println("========= LOGIN DEBUG =========");
        System.out.println("EMAIL FROM REQUEST : " + request.getEmail());

        if (user == null) {
            System.out.println("USER FROM DB       : null");
            System.out.println("================================");
            return ResponseEntity.status(401).build();
        }

        System.out.println("EMAIL FROM DB      : " + user.getEmail());
        System.out.println("RAW PASSWORD       : " + request.getPassword());
        System.out.println("ENCODED PASSWORD   : " + user.getPassword());

        boolean match = passwordEncoder.matches(
                request.getPassword(),
                user.getPassword()
        );

        System.out.println("PASSWORD MATCH     : " + match);
        System.out.println("================================");

        if (!match) {
            return ResponseEntity.status(401).build();
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
