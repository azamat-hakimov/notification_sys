package com.portfolio.notifications.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "greeting")
public interface GreetingClient {

    @GetMapping("/api/greet/{name}")
    String getGreeting(@PathVariable String name);

}
