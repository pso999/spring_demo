package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface IUserService {

    public void addUser(User user);

    public List<User> list();
}
