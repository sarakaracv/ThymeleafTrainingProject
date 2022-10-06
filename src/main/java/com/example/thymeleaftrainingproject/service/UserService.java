package com.example.thymeleaftrainingproject.service;


import com.example.thymeleaftrainingproject.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public void save(User user);
}
