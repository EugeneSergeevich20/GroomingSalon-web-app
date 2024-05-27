package com.example.groomingsalonwebapp.service;

import com.example.groomingsalonwebapp.model.Appointment;
import com.example.groomingsalonwebapp.model.User;
import com.example.groomingsalonwebapp.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> findByUser(User user) {
        return appointmentRepository.findByUser(user);
    }

}
