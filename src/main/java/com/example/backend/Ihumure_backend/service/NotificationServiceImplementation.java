package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Notification;
import com.example.backend.Ihumure_backend.repository.NotificationRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{
    private final NotificationRepository notificationRepository;
    private final UserRepository userRepository;

    @Autowired
    public NotificationServiceImplementation(NotificationRepository notificationRepository, UserRepository userRepository) {
        this.notificationRepository = notificationRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Notification> getAllNotifications() {
        return null;
    }

    @Override
    public Notification getNotificationById(Long id) {
        return null;
    }

    @Override
    public Notification save(Notification notification, Long recipientId) {
        return null;
    }

    @Override
    public Notification update(Long id, Notification notification) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
