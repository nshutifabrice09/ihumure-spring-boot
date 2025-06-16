package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.GroupPost;
import com.example.backend.Ihumure_backend.model.SupportGroup;
import com.example.backend.Ihumure_backend.repository.GroupPostRepository;
import com.example.backend.Ihumure_backend.repository.SupportGroupRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupPostServiceImplementation implements GroupPostService{
    private final GroupPostRepository groupPostRepository;
    private final SupportGroupRepository supportGroupRepository;
    private final UserRepository userRepository;

    @Autowired
    public GroupPostServiceImplementation(GroupPostRepository groupPostRepository, SupportGroupRepository supportGroupRepository, UserRepository userRepository) {
        this.groupPostRepository = groupPostRepository;
        this.supportGroupRepository = supportGroupRepository;
        this.userRepository = userRepository;
    }
    @Override
    public List<GroupPost> getAllGroupPosts() {
        return groupPostRepository.findAll();
    }

    @Override
    public GroupPost getGroupPostById(Long id) {
        return groupPostRepository.findGroupPostById();
    }

    @Override
    public GroupPost save(GroupPost groupPost, Long groupId, Long authorId) {
        SupportGroup supportGroup = supportGroupRepository.findSupportGroupById(groupId);
    }

    @Override
    public GroupPost update(Long id, GroupPost groupPost) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
