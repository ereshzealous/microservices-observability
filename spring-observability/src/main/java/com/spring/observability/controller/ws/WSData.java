package com.spring.observability.controller.ws;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 07/August/2020 By Author Eresh, Gorantla
 **/
@Getter
@Setter
@NoArgsConstructor
public class WSData {
    private WSRegisterUser userData;
    private String notificationStatus;
    private String quote;
}
