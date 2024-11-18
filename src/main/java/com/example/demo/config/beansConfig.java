package com.example.demo.config;

import com.example.demo.Dao.UserDaoImpl;
import com.example.demo.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beansConfig {
    @Bean
    public UserDaoImpl userDao() {
        return new UserDaoImpl();
    }
    @Bean
    public UserServiceImpl userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }
}
