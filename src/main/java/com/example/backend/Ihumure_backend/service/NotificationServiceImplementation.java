package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Notification;
import com.example.backend.Ihumure_backend.model.User;
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
        return notificationRepository.findAll();
    }

    @Override
    public Notification getNotificationById(Long id) {
        return notificationRepository.findNotificationById(id);
    }

    @Override
    public Notification saveNotification(Notification notification, Long recipientId) {
        User user = userRepository.findUserById(recipientId);
        notification.setRecipient(user);
        return notificationRepository.save(notification);
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        Notification existNotification = notificationRepository.findNotificationById(id);
        if(existNotification != null){
            existNotification.setMessage(notification.getMessage());
            existNotification.setRead(notification.isRead());
            existNotification.setSentAt(notification.getSentAt());
            return notificationRepository.save(existNotification);
        }
        return null;
    }

    @Override
    public void removeNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
