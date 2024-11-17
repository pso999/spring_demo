package com.example.demo.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class userDaoImpl implements userDao {
    @Override
    public void initUserDao(){
        System.out.println("InitUserDao:");
    }

}
