package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.AssessmentQuestion;
import com.example.backend.Ihumure_backend.service.AssessmentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class AssessmentQuestionController {

    private final AssessmentQuestionService assessmentQuestionService;

    @Autowired
    public AssessmentQuestionController(AssessmentQuestionService assessmentQuestionService) {
        this.assessmentQuestionService = assessmentQuestionService;
    }

    @PostMapping("/assessmentQuestion")
    public AssessmentQuestion save(@RequestBody AssessmentQuestion assessmentQuestion){
        return assessmentQuestionService.saveAssessmentQuestion(assessmentQuestion);
    }

    @GetMapping("/assessmentQuestions")
    public List<AssessmentQuestion> assessmentQuestionList(){
        return assessmentQuestionService.getAllAssessmentQuestions();
    }

    @GetMapping("/assessmentQuestion/{id}")
    public AssessmentQuestion getAssessmentQuestion(@PathVariable ("id") Long id){
        return assessmentQuestionService.getAssessmentQuestionById(id);
    }

    @PutMapping("/update/assessmentQuestion/{id}")
    public AssessmentQuestion updateAssessmentQuestion(@PathVariable ("id") Long id, @RequestBody AssessmentQuestion assessmentQuestion){
        return assessmentQuestionService.updateAssessmentQuestion(id, assessmentQuestion);
    }

    @DeleteMapping("/delete/assessmentQuestion/{id}")
    public void delete(@PathVariable ("id") Long id){
        assessmentQuestionService.removeAssessmentQuestion(id);
    }
}
