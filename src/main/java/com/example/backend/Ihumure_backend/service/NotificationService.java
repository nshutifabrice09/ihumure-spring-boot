package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    Notification save(Notification notification, Long recipientId);
    Notification update(Long id, Notification notification);
    void remove(Long id);
}
