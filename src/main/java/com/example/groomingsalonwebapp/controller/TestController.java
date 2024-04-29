package com.example.groomingsalonwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/login-page")
    public String login(){
        return "login";
    }

    @GetMapping("/reg")
    public String reg(){
        return "registration";
    }

}
