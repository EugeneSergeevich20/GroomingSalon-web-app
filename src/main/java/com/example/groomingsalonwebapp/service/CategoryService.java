package com.example.groomingsalonwebapp.service;

import com.example.groomingsalonwebapp.model.Category;

import java.util.List;

public interface CategoryService {

    void create(Category category);

    List<Category> getCategoryList();

}
