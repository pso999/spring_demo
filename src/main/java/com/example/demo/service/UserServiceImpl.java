package com.example.demo.service;

import com.example.demo.Dao.UserDao;
import com.example.demo.entity.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    private User user;


    @Override
    public void addUser(User user) {
        userDao.addUserDao(user);
        System.out.println("AddUser:");
    }

    @Override
    public List<User> list(){

      return new ArrayList<>();

    }

}
