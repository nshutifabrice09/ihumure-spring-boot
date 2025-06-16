package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.GroupPost;

import java.util.List;

public interface GroupPostService {
    List<GroupPost> getAllGroupPosts();
    GroupPost getGroupPostById(Long id);
    GroupPost saveGroupPost(GroupPost groupPost, Long groupId, Long authorId);
    GroupPost updateGroupPost(Long id, GroupPost groupPost);
    void removeGroupPost(Long id);
}
