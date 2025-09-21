package com.pulse1.service;

import com.pulse1.model.User;
import com.pulse1.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AuthService {
    private final UserRepository repo;

    public AuthService(UserRepository repo) { this.repo = repo; }

    public User signup(User user) {
        // hash password using BCrypt
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return repo.save(user);
    }

    public Optional<String> login(String email, String password) {
        Optional<User> u = repo.findByEmail(email);
        if (u.isPresent()) {
            User user = u.get();
            if (BCrypt.checkpw(password, user.getPassword())) {
                // return a simple token (UUID) - for full JWT, implement later
                String token = UUID.randomUUID().toString();
                return Optional.of(token);
            }
        }
        return Optional.empty();
    }
}