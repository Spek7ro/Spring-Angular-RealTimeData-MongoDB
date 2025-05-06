package com.cris.notificationsapp.services;

import com.cris.notificationsapp.Models.Notification;
import com.cris.notificationsapp.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private NotificationRepository notificationRepository;
    private final ReactiveMongoTemplate reactiveMongoTemplate;

    // Get all notifications
    public Flux<Notification> getAll() {
        return notificationRepository.findAll();
    }

    // Save a notification
    public Mono<Notification> save(Notification notification) {
        return notificationRepository.save(notification);
    }

    // find notification by id
    public Mono<Notification> findById(String id) {
        return notificationRepository.findById(id);
    }

    // Update notification
    public Mono<Notification> updateSeverity(Notification notification, String severity) {
        return findById(notification.getId()).flatMap(notification1 -> {
            notification1.setSeverity(severity);
            return notificationRepository.save(notification1);
        });
    }

    // delete notification by id
    public Mono<Void> deleteById(String id) {
        return findByid(id).flatMap(notificationRepository::delete);
    }
}
