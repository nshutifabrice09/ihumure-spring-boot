package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.SupportGroup;
import com.example.backend.Ihumure_backend.repository.SupportGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportGroupServiceImplementation implements SupportGroupService{

    private final SupportGroupRepository supportGroupRepository;

    @Autowired
    public SupportGroupServiceImplementation(SupportGroupRepository supportGroupRepository){
        this.supportGroupRepository = supportGroupRepository;
    }
    @Override
    public List<SupportGroup> getAllSupportGroups() {
        return supportGroupRepository.findAll();
    }

    @Override
    public SupportGroup getSupportGroupById(Long id) {
        return supportGroupRepository.findSupportGroupById(id);
    }

    @Override
    public SupportGroup save(SupportGroup supportGroup) {
        return supportGroupRepository.save(supportGroup);
    }

    @Override
    public SupportGroup update(Long id, SupportGroup supportGroup) {
        SupportGroup existSupportGroup = supportGroupRepository.findSupportGroupById(id);
        if(existSupportGroup != null){
            existSupportGroup.setName(supportGroup.getName());
            existSupportGroup.setTopic(supportGroup.getTopic());
            existSupportGroup.setDescription(supportGroup.getDescription());
            return supportGroupRepository.save(existSupportGroup);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        supportGroupRepository.deleteById(id);
    }
}
