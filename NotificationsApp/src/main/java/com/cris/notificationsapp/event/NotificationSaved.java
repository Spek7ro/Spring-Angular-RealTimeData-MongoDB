package com.cris.notificationsapp.event;

import com.cris.notificationsapp.Models.Notification;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NotificationSaved implements Event{

    private Notification notification;

}
