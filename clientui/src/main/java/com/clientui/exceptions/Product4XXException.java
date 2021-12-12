package com.clientui.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class Product4XXException extends RuntimeException{
    public Product4XXException(String message) {
        super(message);
    }
}
