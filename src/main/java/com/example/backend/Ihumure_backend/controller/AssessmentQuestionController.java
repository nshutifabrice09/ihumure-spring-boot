package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.AssessmentQuestion;
import com.example.backend.Ihumure_backend.service.AssessmentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessment-question")
@CrossOrigin("http://localhost:3000")
public class AssessmentQuestionController {

    private final AssessmentQuestionService assessmentQuestionService;

    @Autowired
    public AssessmentQuestionController(AssessmentQuestionService assessmentQuestionService) {
        this.assessmentQuestionService = assessmentQuestionService;
    }

    @PostMapping("/")
    public ResponseEntity<AssessmentQuestion> createAssessmentQuestionResponse(@RequestBody AssessmentQuestion assessmentQuestion){
        AssessmentQuestion saveAssessmentQuestion = assessmentQuestionService.saveAssessmentQuestion(assessmentQuestion);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveAssessmentQuestion);
    }

    @GetMapping("/")
    public ResponseEntity<List<AssessmentQuestion>> getAll(){
        return ResponseEntity.ok(assessmentQuestionService.getAllAssessmentQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssessmentQuestion> getAssessmentQuestion(@PathVariable Long id) {
        return assessmentQuestionService.getAssessmentQuestionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public AssessmentQuestion updateAssessmentQuestion(@PathVariable ("id") Long id, @RequestBody AssessmentQuestion assessmentQuestion){
        return assessmentQuestionService.updateAssessmentQuestion(id, assessmentQuestion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Long id){
        assessmentQuestionService.removeAssessmentQuestion(id);
    }
}
