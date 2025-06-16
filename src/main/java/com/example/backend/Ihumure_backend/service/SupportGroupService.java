package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.SupportGroup;

import java.util.List;

public interface SupportGroupService {
    List<SupportGroup> getAllSupportGroups();
    SupportGroup getSupportGroupById(Long id);
    SupportGroup save(SupportGroup supportGroup);
    SupportGroup update(Long id, SupportGroup supportGroup);
    void remove(Long id);
}
