package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    Notification saveNotification(Notification notification, Long recipientId);
    Notification updateNotification(Long id, Notification notification);
    void removeNotification(Long id);
}
