package com.example.groomingsalonwebapp.service.impl;

import com.example.groomingsalonwebapp.model.Category;
import com.example.groomingsalonwebapp.repository.CategoryRepository;
import com.example.groomingsalonwebapp.repository.ServiceRepository;
import com.example.groomingsalonwebapp.service.ServicesService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {

    private final CategoryRepository categoryRepository;
    private final ServiceRepository serviceRepository;

    public ServicesServiceImpl(CategoryRepository categoryRepository, ServiceRepository serviceRepository) {
        this.categoryRepository = categoryRepository;
        this.serviceRepository = serviceRepository;
    }

    @Override
    public void create(com.example.groomingsalonwebapp.model.Service service) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<com.example.groomingsalonwebapp.model.Service> findByCategory(Category category) {
        return serviceRepository.findByCategory(category);
    }
}
