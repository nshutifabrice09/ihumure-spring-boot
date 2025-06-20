package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.GroupPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPostRepository extends JpaRepository<GroupPost, Long> {
    GroupPost findGroupPostById(Long postId);
}
