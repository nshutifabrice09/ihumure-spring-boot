package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Therapist;
import com.example.backend.Ihumure_backend.repository.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TherapistServiceImplementation implements TherapistService{
    private final TherapistRepository therapistRepository;

    @Autowired
    public TherapistServiceImplementation(TherapistRepository therapistRepository) {
        this.therapistRepository = therapistRepository;
    }

    @Override
    public List<Therapist> getAlTherapists() {
        return therapistRepository.findAll();
    }

    @Override
    public Therapist getTherapistById(Long id) {
        return therapistRepository.findTherapyById(id);
    }

    @Override
    public Therapist saveTherapist(Therapist therapist) {
        return therapistRepository.save(therapist);
    }

    @Override
    public Therapist updateTherapist(Long id, Therapist therapist) {
        Therapist existTherapist = therapistRepository.findTherapyById(id);
        return null;
    }

    @Override
    public void removeTherapist(Long id) {
        therapistRepository.deleteById(id);
    }
}
