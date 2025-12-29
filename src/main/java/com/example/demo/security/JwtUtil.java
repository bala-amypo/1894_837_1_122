package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // ✅ SECRET KEY (must be long enough for HS256)
    private static final String SECRET =
            "mysecretkeymysecretkeymysecretkeymysecretkey";

    private static final long EXPIRATION_TIME =
            1000 * 60 * 60 * 24; // 1 day

    private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    // ===================== TOKEN GENERATION =====================
    public String generateToken(String email, String role, Long userId) {

        return Jwts.builder()
                .setSubject(email)
                .claim("role", role)
                .claim("userId", userId)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    // ===================== VALIDATION =====================
    public boolean validateToken(String token) {
        try {
            extractAllClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // ===================== EXTRACTION =====================
    public String extractEmail(String token) {
        return extractAllClaims(token).getSubject();
    }

    public String extractRole(String token) {
        return extractAllClaims(token).get("role", String.class);
    }

    public Long extractUserId(String token) {
        return extractAllClaims(token).get("userId", Long.class);
    }

    // ===================== INTERNAL =====================
    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()                // 🔥 THIS WAS MISSING
                .parseClaimsJws(token)
                .getBody();
    }
}
