package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.Assessment;
import com.example.backend.Ihumure_backend.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessment")
@CrossOrigin("http://localhost:3000")
public class AssessmentController {

    private final AssessmentService assessmentService;

    @Autowired
    public AssessmentController(AssessmentService assessmentService) {
        this.assessmentService = assessmentService;
    }


    @PostMapping("/{userId}")
    public Assessment saveAssessment(@RequestBody Assessment assessment, @PathVariable("userId") Long userId){
        return assessmentService.saveAssessment(assessment, userId);
    }

    @GetMapping("/")
    public List<Assessment> assessmentList(){
        return assessmentService.getAllAssessments();
    }

    @GetMapping("/{id}")
    public Assessment getAssessment(@PathVariable ("id") Long id){
        return assessmentService.getAssessmentById(id);
    }

    @PutMapping("/update/{id}")
    public Assessment updateAssessment (@PathVariable ("id") Long id, @RequestBody Assessment assessment){
        return assessmentService.updateAssessment(id, assessment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAssessment(@PathVariable ("id") Long id){
        assessmentService.removeAssessment(id );
    }
}
