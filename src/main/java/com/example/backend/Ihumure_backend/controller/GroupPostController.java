package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.GroupPost;
import com.example.backend.Ihumure_backend.service.GroupPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group-post")
@CrossOrigin("http://localhost:3000")
public class GroupPostController {

    private final GroupPostService groupPostService;

    @Autowired
    public GroupPostController(GroupPostService groupPostService) {
        this.groupPostService = groupPostService;
    }

    @PostMapping("/{groupId}/{authorId}")
    public GroupPost saveGroupPost(@RequestBody GroupPost groupPost, @PathVariable ("groupId") Long groupId,
                                   @PathVariable ("authorId") Long authorId){
        return groupPostService.saveGroupPost(groupPost, groupId, authorId);
    }

    @GetMapping("/")
    public List<GroupPost> groupPostList(){
        return groupPostService.getAllGroupPosts();
    }

    @GetMapping("/{id}")
    public GroupPost getGroupPost(@PathVariable ("id") Long id){
        return groupPostService.getGroupPostById(id);
    }

    @PutMapping("/update/{id}")
    public GroupPost updateGroupPost(@PathVariable ("id") Long id, @RequestBody GroupPost groupPost){
        return groupPostService.updateGroupPost(id, groupPost);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        groupPostService.removeGroupPost(id);
    }
}
