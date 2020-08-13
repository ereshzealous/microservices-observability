package com.spring.rapidapi.controller;

import com.spring.rapidapi.controller.ws.WSQuote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created on 10/August/2020 By Author Eresh, Gorantla
 **/
@RestController
@RequestMapping("/api")
public class DailyTipsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${rapid.api.apikey}")
    String apiKey;

    @Value("${rapid.api.tip.api.url}")
    String tipUrl;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/tips/random")
    public ResponseEntity<WSQuote> getRandomQuote() {
        logger.info("Daily Trips API Invoked...");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-RapidAPI-Key", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<WSQuote> responseEntity = restTemplate.exchange(tipUrl, HttpMethod.GET, entity, WSQuote.class);
        return ResponseEntity.ok(responseEntity.getBody());
    }
}
