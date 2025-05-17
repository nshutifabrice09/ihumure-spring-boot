package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@Entity
@Table(name = "group_posts")
@NoArgsConstructor
@AllArgsConstructor

public class GroupPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SupportGroup group;

    @ManyToOne
    private User author;

    private String content;
    private LocalDate createdAt;
}
