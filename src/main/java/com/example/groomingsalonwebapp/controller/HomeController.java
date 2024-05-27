package com.example.groomingsalonwebapp.controller;

import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    /*@GetMapping("/home")
    public String homePage(Model model){

        User user = userService.getAuthUser();
        model.addAttribute("user", user);

        return "index";
    }*/

}
