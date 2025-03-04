package com.portfolio.notifications.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class NoValueProvidedException extends RuntimeException{

    public NoValueProvidedException(String message){
        super(message);
    }

}
