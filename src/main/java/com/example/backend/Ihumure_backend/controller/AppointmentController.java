package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.Appointment;
import com.example.backend.Ihumure_backend.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/appointment/{therapistId}/{userId}")
    public Appointment saveAppointment(@RequestBody Appointment appointment,
                                       @PathVariable ("therapistId") Long therapistId, @PathVariable ("userId") Long userId){
        return appointmentService.saveAppointment(appointment, therapistId, userId);
    }

}
