package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository <Appointment, Long>{
}
