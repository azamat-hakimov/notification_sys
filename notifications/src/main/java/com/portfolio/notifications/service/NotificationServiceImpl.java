package com.portfolio.notifications.service;

import com.portfolio.notifications.exceptions.NoValueProvidedException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationsService{

    @Value("${default.message}")
    private String defaultMessage;

    @Override
    public String notify(String name) {
        if (name != null && name.length() >= 2){
            return name + defaultMessage;
        }else {
            throw new NoValueProvidedException("Invalid value provided error !!!");
        }
    }
}
