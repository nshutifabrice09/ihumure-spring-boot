package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Therapist;

import java.util.List;

public interface TherapistService {
    List<Therapist> getAlTherapists();
    Therapist getTherapistById(Long id);
    Therapist saveTherapist(Therapist therapist);
    Therapist updateTherapist(Long id, Therapist therapist);
    void remove(Long id);
}
