package com.example.thymeleaftrainingproject.service.implementation;


import com.example.thymeleaftrainingproject.bootstrap.DataGenerator;
import com.example.thymeleaftrainingproject.model.User;
import com.example.thymeleaftrainingproject.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    @Override
    public List<User> getUsers() {
        return DataGenerator.USER_LIST;
    }

    @Override
    public void save(User user) {
        DataGenerator.USER_LIST.add(user);
    }
}
