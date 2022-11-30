package com.sgdevops.devopspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String m1(){
        return "Hello, Welcome to devops";
    }
}
