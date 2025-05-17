package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@Entity
@Table(name = "support_groups")
@NoArgsConstructor
@AllArgsConstructor

public class SupportGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String topic;
    private String description;

    @OneToMany(mappedBy = "group")
    private List<GroupPost> posts;
}
