package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.SupportGroup;
import com.example.backend.Ihumure_backend.service.SupportGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/support-group")
@CrossOrigin("http://localhost:3000")
public class SupportGroupController {

    private final SupportGroupService supportGroupService;

    @Autowired
    public SupportGroupController(SupportGroupService supportGroupService) {
        this.supportGroupService = supportGroupService;
    }

    @PostMapping("/")
    public SupportGroup save(@RequestBody SupportGroup supportGroup){
        return supportGroupService.saveSupportGroup(supportGroup);
    }

    @GetMapping("/")
    public List<SupportGroup> supportGroupList(){
        return supportGroupService.getAllSupportGroups();
    }

    @GetMapping("/{id}")
    public SupportGroup getSupportGroup(@PathVariable ("id") Long id){
        return supportGroupService.getSupportGroupById(id);
    }

    @PutMapping("/update/{id}")
    public SupportGroup updateSupportGroup(@PathVariable ("id") Long id, @RequestBody SupportGroup supportGroup){
        return supportGroupService.updateSupportGroup(id, supportGroup);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSupportGroup(@PathVariable ("id") Long id){
        supportGroupService.removeSupportGroup(id);
    }
}
