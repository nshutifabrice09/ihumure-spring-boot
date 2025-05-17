package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    Appointment save(Appointment appointment, Long therapyId, Long userId);
    Appointment updateAppointment(Long id, Appointment appointment);
    void removeById(Long id);

}
