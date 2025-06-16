package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.GroupPost;

import java.util.List;

public interface GroupPostService {
    List<GroupPost> getAllGroupPosts();
    GroupPost getGroupPostById(Long id);
    GroupPost save(GroupPost groupPost, Long groupId, Long authorId);
    GroupPost update(Long id, GroupPost groupPost);
    void remove(Long id);
}
