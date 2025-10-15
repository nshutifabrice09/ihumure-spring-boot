package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.AssessmentAnswer;
import com.example.backend.Ihumure_backend.service.AssessmentAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessment-answer")
@CrossOrigin("http://localhost:3000")
public class AssessmentAnswerController {

    private final AssessmentAnswerService assessmentAnswerService;

    @Autowired
    public AssessmentAnswerController (AssessmentAnswerService assessmentAnswerService){
        this.assessmentAnswerService= assessmentAnswerService;
    }

    @PostMapping("/{assessmentId}/{questionId}")
    public AssessmentAnswer saveAssessmentAnswer(@RequestBody AssessmentAnswer assessmentAnswer,
                                                 @PathVariable ("assessmentId") Long assessmentId, @PathVariable ("questionId") Long questionId){
        return assessmentAnswerService.saveAssessmentAnswer(assessmentAnswer, assessmentId, questionId);
    }

    @GetMapping("/")
    public List<AssessmentAnswer> assessmentAnswerList(){
        return assessmentAnswerService.getAllAssessmentAnswers();
    }

    @GetMapping("/{id}")
    public  AssessmentAnswer getAssessmentAnswer(@PathVariable ("id") Long id){
        return assessmentAnswerService.getAssessmentAnswerById(id);
    }

    @PutMapping("/update/{id}")
    public AssessmentAnswer updateAssessmentAnswer(@PathVariable ("id") Long id, @RequestBody AssessmentAnswer assessmentAnswer){
        return assessmentAnswerService.updateAssessmentAnswer(id, assessmentAnswer);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteAssessmentAnswer(@PathVariable ("id") Long id){
        assessmentAnswerService.removeAssessmentAnswer(id);
    }
}
