package com.example.groomingsalonwebapp.service;

import com.example.groomingsalonwebapp.model.Category;
import com.example.groomingsalonwebapp.model.Service;

import java.util.List;

public interface ServicesService {

    void create(Service service);
    void delete(Long id);
    List<Service> findByCategory(Category category);

}
