package com.example.groomingsalonwebapp.controller;

import com.example.groomingsalonwebapp.model.Appointment;
import com.example.groomingsalonwebapp.model.Category;
import com.example.groomingsalonwebapp.model.Service;
import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.service.AppointmentService;
import com.example.groomingsalonwebapp.service.CategoryService;
import com.example.groomingsalonwebapp.service.ServicesService;
import com.example.groomingsalonwebapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
public class ServiceController {

    private final UserService userService;
    private final ServicesService service;
    private final CategoryService categoryService;
    public final AppointmentService appointmentService;

    public ServiceController(UserService userService, ServicesService service, CategoryService categoryService, AppointmentService appointmentService) {
        this.userService = userService;
        this.service = service;
        this.categoryService = categoryService;
        this.appointmentService = appointmentService;
    }

    @GetMapping("/home")
    public String getServices(Model model){
        User userAuth = userService.getAuthUser();
        model.addAttribute("user", userAuth);

        List<Category> categories = categoryService.getCategoryList();

        HashMap<String, Category> nameCategories = null;
        HashMap<String, List<Service>> categoryServices = null;

        if (categories != null){
            nameCategories = new HashMap<>();
            categoryServices = new HashMap<>();
            for (Category category:
                    categories) {
                nameCategories.put(category.getName(), category);
                categoryServices.put(category.getName(), service.findByCategory(category));
            }
        }

        if (nameCategories != null){
            model.addAttribute("category", nameCategories);
            model.addAttribute("categories", categories);
        }

        if (categoryServices != null){
            model.addAttribute("categoryServices", categoryServices);
        }

        // для записи на услугу
        model.addAttribute("appointment", new Appointment());

        return "index";
    }

    @PostMapping("/appointments/new")
    public String saveAppointment(@ModelAttribute Appointment appointment) {
        appointmentService.save(appointment);
        return "redirect:/home";
    }

    @GetMapping("/services")
    @ResponseBody
    public List<Service> getServiceByCategory(@RequestParam Long categoryId){

        Category category = new Category();
        category.setID(categoryId);

        return service.findByCategory(category);
    }

}
