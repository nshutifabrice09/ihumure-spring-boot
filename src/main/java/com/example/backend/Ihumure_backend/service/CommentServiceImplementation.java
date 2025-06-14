package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService{
    @Override
    public List<Comment> getAllComments() {
        return null;
    }

    @Override
    public Comment getCommentById(Long id) {
        return null;
    }

    @Override
    public Comment save(Comment comment, Long postId, Long authorId) {
        return null;
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        return null;
    }

    @Override
    public void removeId(Long id) {

    }
}
