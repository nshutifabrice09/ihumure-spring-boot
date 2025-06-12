package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Appointment;
import com.example.backend.Ihumure_backend.repository.AppointmentRepository;
import com.example.backend.Ihumure_backend.repository.TherapistRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService{
    private final AppointmentRepository appointmentRepository;
    private final TherapistRepository therapistRepository;
    private final UserRepository userRepository;

    public AppointmentServiceImplementation(AppointmentRepository appointmentRepository, TherapistRepository therapistRepository, UserRepository userRepository) {
        this.appointmentRepository = appointmentRepository;
        this.therapistRepository = therapistRepository;
        this.userRepository = userRepository;
    }


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
