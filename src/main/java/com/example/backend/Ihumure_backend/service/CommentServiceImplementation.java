package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Comment;
import com.example.backend.Ihumure_backend.model.GroupPost;
import com.example.backend.Ihumure_backend.model.User;
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
    public Comment saveComment(Comment comment, Long postId, Long authorId) {
        GroupPost groupPost = groupPostRepository.findGroupPostById(postId);
        User user = userRepository.findUserById(authorId);
        comment.setPost(groupPost);
        comment.setAuthor(user);
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        Comment existComment = commentRepository.findCommentById(id);
        if(existComment !=null){
            existComment.setText(comment.getText());
            existComment.setCreatedAt(comment.getCreatedAt());
            return commentRepository.save(existComment);
        }
        return null;
    }

    @Override
    public void removeComment(Long id) {
        commentRepository.deleteById(id);
    }
}
