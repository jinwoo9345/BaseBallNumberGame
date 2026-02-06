package com.example;

public enum ResultEnum {
    STRIKE("스트라이크"),
    BALL("볼"),
    OUT("아웃");


    private final String message;

    ResultEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
