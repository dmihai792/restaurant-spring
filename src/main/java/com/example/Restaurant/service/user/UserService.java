package com.example.Restaurant.service.user;

import com.example.Restaurant.model.user.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);
}
