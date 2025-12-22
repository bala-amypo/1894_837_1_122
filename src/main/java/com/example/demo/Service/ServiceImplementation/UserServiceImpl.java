package com.example.demo.Service.ServiceImplementation;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        return user;
    }
}
