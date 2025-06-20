package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.SupportGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportGroupRepository extends JpaRepository<SupportGroup, Long> {
    SupportGroup findSupportGroupById(Long groupId);
}
