package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Comment;
import com.example.backend.Ihumure_backend.model.GroupPost;
import com.example.backend.Ihumure_backend.repository.CommentRepository;
import com.example.backend.Ihumure_backend.repository.GroupPostRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService{
    private final CommentRepository commentRepository;
    private final GroupPostRepository groupPostRepository;
    private final UserRepository userRepository;

    @Autowired
    public CommentServiceImplementation(CommentRepository commentRepository, GroupPostRepository groupPostRepository, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.groupPostRepository = groupPostRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public Comment save(Comment comment, Long postId, Long authorId) {
        GroupPost groupPost = groupPostRepository.findGroupPostById(postId);
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        return null;
    }

    @Override
    public void removeId(Long id) {

    }
}
