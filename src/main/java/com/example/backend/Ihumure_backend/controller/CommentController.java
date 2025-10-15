package com.example.backend.Ihumure_backend.controller;


import com.example.backend.Ihumure_backend.model.Comment;
import com.example.backend.Ihumure_backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
@CrossOrigin("http://localhost:3000")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/{postId}/{authorId}")
    public Comment saveComment(@RequestBody Comment comment, @PathVariable("postId") Long postId, @PathVariable ("authorId") Long authorId){
        return commentService.saveComment(comment, postId, authorId);
    }

    @GetMapping("/")
    public List<Comment> commentList(){
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable("id") Long id){
        return commentService.getCommentById(id);
    }

    @PutMapping("/update/{id}")
    public Comment updateComment(@PathVariable ("id") Long id, @RequestBody Comment comment){
        return commentService.updateComment(id, comment);
    }

    @DeleteMapping("/Delete/{id}")
    public void deleteComment(@PathVariable ("id") Long id){
        commentService.removeComment(id);
    }
}
