package com.fvucemilo.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "notification",
        url = "${clients.notification.url}"
)
public interface NotificationClient {

    void sendNotification(NotificationRequest notificationRequest);
}
