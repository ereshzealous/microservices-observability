package com.spring.user.registration.controller;

import com.spring.user.registration.controller.ws.WSRegisterUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created on 10/August/2020 By Author Eresh, Gorantla
 **/
@RestController
@RequestMapping("/api")
public class RegisterController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/register")
    public ResponseEntity<WSRegisterUser> registerUser(@RequestBody WSRegisterUser request) {
        request.setId(UUID.randomUUID().toString());
        return ResponseEntity.ok(request);
    }
}
