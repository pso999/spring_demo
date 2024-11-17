package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWolrldController {

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }
}
