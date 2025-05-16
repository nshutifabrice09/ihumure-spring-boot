package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class SupportGroup {
    private Long id;

    private String name;
    private String topic;
    private String description;

    @OneToMany(mappedBy = "group")
    private List<GroupPost> posts;
}
