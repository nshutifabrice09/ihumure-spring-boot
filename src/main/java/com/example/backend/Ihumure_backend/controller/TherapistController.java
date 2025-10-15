package com.example.backend.Ihumure_backend.controller;


import com.example.backend.Ihumure_backend.model.Therapist;
import com.example.backend.Ihumure_backend.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/therapist")
@CrossOrigin("http://localhost:3000")
public class TherapistController {

    private final TherapistService therapistService;

    @Autowired
    public TherapistController(TherapistService therapistService) {
        this.therapistService = therapistService;
    }

    @PostMapping("/")
    public Therapist saveTherapist(@RequestBody Therapist therapist){
        return therapistService.saveTherapist(therapist);
    }

    @GetMapping("/")
    public List<Therapist> therapistList(){
        return therapistService.getAlTherapists();
    }

    @GetMapping("/{id}")
    public Therapist getTherapist(@PathVariable ("id") Long id){
        return therapistService.getTherapistById(id);
    }

    @PutMapping("/update/{id}")
    public Therapist updateTherapist(@PathVariable ("id") Long id, @RequestBody Therapist therapist){
        return therapistService.updateTherapist(id, therapist);
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable ("id") Long id){
        therapistService.removeTherapist(id);
    }
}
