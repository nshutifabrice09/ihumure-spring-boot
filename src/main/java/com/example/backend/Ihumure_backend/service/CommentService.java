package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    Comment save(Comment comment, Long postId, Long authorId);
    Comment updateComment(Long id, Comment comment);
    void removeId(Long id);
}
