package com.rahmi.binfood.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderDetailNotFoundException extends RuntimeException {
    public OrderDetailNotFoundException(String message) {
        super(message);
    }
}