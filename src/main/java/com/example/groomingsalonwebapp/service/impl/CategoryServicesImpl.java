package com.example.groomingsalonwebapp.service.impl;

import com.example.groomingsalonwebapp.model.Category;
import com.example.groomingsalonwebapp.repository.CategoryRepository;
import com.example.groomingsalonwebapp.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServicesImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServicesImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void create(Category category) {

    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }
}
