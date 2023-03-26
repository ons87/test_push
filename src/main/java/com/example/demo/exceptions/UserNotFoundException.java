package com.example.demo.exceptions;

public class UserNotFoundException extends NullPointerException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
