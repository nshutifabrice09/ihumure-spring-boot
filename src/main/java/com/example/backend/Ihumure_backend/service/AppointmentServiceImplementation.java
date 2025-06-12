package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Appointment;
import com.example.backend.Ihumure_backend.model.Therapist;
import com.example.backend.Ihumure_backend.model.User;
import com.example.backend.Ihumure_backend.repository.AppointmentRepository;
import com.example.backend.Ihumure_backend.repository.TherapistRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService{
    private final AppointmentRepository appointmentRepository;
    private final TherapistRepository therapistRepository;
    private final UserRepository userRepository;

    @Autowired
    public AppointmentServiceImplementation(AppointmentRepository appointmentRepository, TherapistRepository therapistRepository, UserRepository userRepository) {
        this.appointmentRepository = appointmentRepository;
        this.therapistRepository = therapistRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findAppointmentById(id);
    }

    @Override
    public Appointment save(Appointment appointment, Long therapyId, Long userId) {
        Therapist therapist = therapistRepository.findTherapyById(therapyId);
        User user = therapistRepository.findUserById(userId);
        appointment.setTherapist(therapist);
        appointment.setUser(user);
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {
        Appointment existAppointment = appointmentRepository.findAppointmentById(id);
        if(existAppointment != null){
            existAppointment.setAppointmentTime(appointment.getAppointmentTime());
            existAppointment.setNotes(appointment.getNotes());
            existAppointment.setConfirmed(appointment.isConfirmed());
            return appointmentRepository.save(existAppointment);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {
        appointmentRepository.deleteById(id);
    }
}
