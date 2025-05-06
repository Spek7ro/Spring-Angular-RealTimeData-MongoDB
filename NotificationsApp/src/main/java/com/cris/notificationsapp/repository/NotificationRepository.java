package com.cris.notificationsapp.repository;

import com.cris.notificationsapp.Models.Notification;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NotificationRepository extends ReactiveMongoRepository<Notification, String> {

}
