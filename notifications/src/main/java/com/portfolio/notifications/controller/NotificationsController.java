package com.portfolio.notifications.controller;

import com.portfolio.notifications.service.NotificationsService;
import com.portfolio.notifications.service.client.GreetingClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class NotificationsController {

    private final NotificationsService service;
    private final GreetingClient greetingClient;


    public NotificationsController(NotificationsService service,
                                   GreetingClient greetingClient) {
        this.service = service;
        this.greetingClient = greetingClient;
    }


    @GetMapping("/notify/{name}")
    public ResponseEntity<String> getNotifications(@PathVariable("name") String name){
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(service.notify(name));
    }

    @GetMapping("/greet/{name}")
    public String sendNotification(@PathVariable("name") String name) {
        return greetingClient.getGreeting(name);
    }
}
