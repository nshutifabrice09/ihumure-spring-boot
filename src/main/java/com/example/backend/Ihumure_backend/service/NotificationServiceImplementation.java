package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{
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
