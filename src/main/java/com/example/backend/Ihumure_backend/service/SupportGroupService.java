package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.SupportGroup;

import java.util.List;

public interface SupportGroupService {
    List<SupportGroup> getAllSupportGroups();
    SupportGroup getSupportGroupById(Long id);
    SupportGroup saveSupportGroup(SupportGroup supportGroup);
    SupportGroup updateSupportGroup(Long id, SupportGroup supportGroup);
    void removeSupportGroup(Long id);
}
