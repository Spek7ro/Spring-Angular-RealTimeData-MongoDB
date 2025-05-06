package com.cris.notificationsapp.event;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NotificationDeleted implements Event{

    private String notificationId;
}
