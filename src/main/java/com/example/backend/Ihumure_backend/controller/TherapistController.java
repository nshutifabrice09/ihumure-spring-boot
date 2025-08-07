package com.example.backend.Ihumure_backend.controller;


import com.example.backend.Ihumure_backend.model.Therapist;
import com.example.backend.Ihumure_backend.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TherapistController {

    private final TherapistService therapistService;

    @Autowired
    public TherapistController(TherapistService therapistService) {
        this.therapistService = therapistService;
    }

    @PostMapping("/therapist")
    public Therapist saveTherapist(@RequestBody Therapist therapist){
        return therapistService.saveTherapist(therapist);
    }

    @GetMapping("therapists")
    public List<Therapist> therapistList(){
        return therapistService.getAlTherapists();
    }
}
