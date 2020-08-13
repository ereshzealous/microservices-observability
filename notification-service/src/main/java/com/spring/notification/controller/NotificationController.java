package com.spring.notification.controller;

import com.spring.notification.controller.ws.WSNotificationRequest;
import com.spring.notification.controller.ws.WSNotificationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 10/August/2020 By Author Eresh, Gorantla
 **/

@RestController
@RequestMapping("/api")
public class NotificationController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/notification")
    public ResponseEntity<WSNotificationResponse> sendNotification(@RequestBody WSNotificationRequest request) {
        if ("Email".equalsIgnoreCase(request.getChannel())) {
            try {
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                logger.error("Exception occurred in sending notification");
            }
        }
        return ResponseEntity.ok(new WSNotificationResponse());
    }
}
