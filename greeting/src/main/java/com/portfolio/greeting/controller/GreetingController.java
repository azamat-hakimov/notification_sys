package com.portfolio.greeting.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Value("${default.greeting}")
    private String greetingMessage;

    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name){
        return greetingMessage + " " + name + "!";
    }

}
