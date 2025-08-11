package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class AssessmentController {

    private final AssessmentRepository assessmentRepository;

    @Autowired
    public AssessmentController(AssessmentRepository assessmentRepository) {
        this.assessmentRepository = assessmentRepository;
    }
}
