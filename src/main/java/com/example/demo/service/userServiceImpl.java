package com.example.demo.service;

import com.example.demo.Dao.userDao;
import com.example.demo.Dao.userDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    // @Autowired(自动注入)
    private userDaoImpl userDao;

    public userServiceImpl() {}

    public void setUserDao(userDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.initUserDao();
        System.out.println("AddUser:");
    }
}
