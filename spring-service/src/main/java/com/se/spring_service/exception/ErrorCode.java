package com.se.spring_service.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception!!"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1002, "User existed!!"),
    USERNAME_INVALID(1003, "username must be at least 3 characters"),
    PASSWORD_INVALID(1004, "password must be at least 8 characters");

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
