package com.example.test.pismo.application.exception;

public class AccountExistentException extends RuntimeException {

    public AccountExistentException(String message) {
        super(message);
    }
}
