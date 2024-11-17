package com.example.demo;

import com.example.demo.service.userService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        userService userService = (userService) applicationContext.getBean("userService");
        userService.addUser();

        userService name1 = (userService) applicationContext.getBean("name1");
        System.out.println("调用name1");
        name1.addUser();
        userService name2 = (userService) applicationContext.getBean("name2");
        System.out.println("调用name2");
        name2.addUser();
        userService name3 = (userService) applicationContext.getBean("name3");
        System.out.println("调用name3");
        name3.addUser();
    }
}
