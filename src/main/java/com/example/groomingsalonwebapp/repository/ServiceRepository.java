package com.example.groomingsalonwebapp.repository;

import com.example.groomingsalonwebapp.model.Category;
import com.example.groomingsalonwebapp.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

    List<Service> findByCategory(Category category);

}
