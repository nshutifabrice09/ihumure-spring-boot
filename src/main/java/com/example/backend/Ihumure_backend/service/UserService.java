package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById (Long id);
    User saveUser(User user);
    User updateUser (Long id, User user);
    void removeUser (Long id);
}
