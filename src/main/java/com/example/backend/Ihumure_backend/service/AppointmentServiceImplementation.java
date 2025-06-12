package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService{
    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return null;
    }

    @Override
    public Appointment save(Appointment appointment, Long therapyId, Long userId) {
        return null;
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
