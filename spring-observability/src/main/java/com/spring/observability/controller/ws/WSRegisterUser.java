package com.spring.observability.controller.ws;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 10/August/2020 By Author Eresh, Gorantla
 **/
@Getter
@Setter
@NoArgsConstructor
public class WSRegisterUser {
    private String id;
    private String name;
    private String email;
    private String city;
    private String mobileNumber;
}
