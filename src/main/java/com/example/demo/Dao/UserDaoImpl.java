package com.example.demo.Dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao(User user) {

        System.out.println("InitUserDao:");
    }

}
