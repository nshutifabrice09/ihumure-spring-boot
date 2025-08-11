package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.SupportGroup;
import com.example.backend.Ihumure_backend.service.SupportGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SupportGroupController {

    private final SupportGroupService supportGroupService;

    @Autowired
    public SupportGroupController(SupportGroupService supportGroupService) {
        this.supportGroupService = supportGroupService;
    }

    @PostMapping("/supportGroup")
    public SupportGroup save(@RequestBody SupportGroup supportGroup){
        return supportGroupService.saveSupportGroup(supportGroup);
    }

    @GetMapping("/supportGroups")
    public List<SupportGroup> supportGroupList(){
        return supportGroupService.getAllSupportGroups();
    }

    @GetMapping("/supportGroup/{id}")
    public SupportGroup getSupportGroup(@PathVariable ("id") Long id){
        return supportGroupService.getSupportGroupById(id);
    }

    @PutMapping("/update/supportGroup/{id}")
    public SupportGroup updateSupportGroup(@PathVariable ("id") Long id, @RequestBody SupportGroup supportGroup){
        return supportGroupService.updateSupportGroup(id, supportGroup);
    }

    @DeleteMapping("/delete/supportGroup/{id}")
    public void deleteSupportGroup(@PathVariable ("id") Long id){
        supportGroupService.removeSupportGroup(id);
    }
}
