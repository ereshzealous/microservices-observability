package com.spring.notification.controller.ws;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 10/August/2020 By Author Eresh, Gorantla
 **/
@Getter
@Setter
@NoArgsConstructor
public class WSNotificationRequest {
    private String notificationType;
    private String channel;
}
