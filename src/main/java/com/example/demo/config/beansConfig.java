package com.example.demo.config;

import com.example.demo.Dao.userDaoImpl;
import com.example.demo.service.userService;
import com.example.demo.service.userServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beansConfig {
    @Bean
    public userDaoImpl userDao() {
        return new userDaoImpl();
    }
    @Bean
    public userServiceImpl userService() {
        userServiceImpl userService = new userServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }
}
