package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.GroupPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupPostServiceImplementation implements GroupPostService{
    @Override
    public List<GroupPost> getAllGroupPosts() {
        return null;
    }

    @Override
    public GroupPost getGroupPostById(Long id) {
        return null;
    }

    @Override
    public GroupPost save(GroupPost groupPost, Long groupId, Long authorId) {
        return null;
    }

    @Override
    public GroupPost update(Long id, GroupPost groupPost) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
