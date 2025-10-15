package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.Notification;
import com.example.backend.Ihumure_backend.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notification")
@CrossOrigin("/http://localhost/3000")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/{recipientId}")
    public Notification save(@RequestBody Notification notification, @PathVariable ("recipientId") Long recipientId){
        return notificationService.saveNotification(notification, recipientId);
    }

    @GetMapping("/")
    public List<Notification> notificationList(){
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable ("id") Long id){
        return notificationService.getNotificationById(id);
    }

    @PutMapping("/update/{id}")
    public Notification updateNotification(@PathVariable ("id") Long id, @RequestBody Notification notification){
        return notificationService.updateNotification(id, notification);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNotification(@PathVariable ("id") Long id){
        notificationService.removeNotification(id);
    }
}
