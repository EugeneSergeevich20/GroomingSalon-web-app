package com.example.groomingsalonwebapp.repository;

import com.example.groomingsalonwebapp.model.Appointment;
import com.example.groomingsalonwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByUser(User user);

}
