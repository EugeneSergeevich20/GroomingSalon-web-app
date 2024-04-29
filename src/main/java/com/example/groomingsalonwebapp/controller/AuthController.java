package com.example.groomingsalonwebapp.controller;

import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage(@ModelAttribute("regUser")User user){
        return "registration";
    }

    @PostMapping("/reg-process")
    public String regProcess(@ModelAttribute("regUser") User user){
        userService.register(user);
        return "redirect:/auth/login";
    }
}
