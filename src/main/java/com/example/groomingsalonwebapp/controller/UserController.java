package com.example.groomingsalonwebapp.controller;

import com.example.groomingsalonwebapp.model.Appointment;
import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.service.AppointmentService;
import com.example.groomingsalonwebapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final AppointmentService appointmentService;

    public UserController(UserService userService, AppointmentService appointmentService) {
        this.userService = userService;
        this.appointmentService = appointmentService;
    }

    @GetMapping("/account/{login}")
    public String getAccountPage(@PathVariable("login") String login, Model model){

        User user = userService.getAuthUser();
        model.addAttribute("user", user);

        List<Appointment> appointments = appointmentService.findByUser(user);
        model.addAttribute("appointments", appointments);

        return "account";
    }

    @PostMapping("/edit-user/process")
    public String editUser(@ModelAttribute("user") User user){

        User userAuth = userService.getAuthUser();
        userService.updateUser(userAuth, user);
        return "redirect:/user/account/" + userAuth.getUsername();
    }

}
