package com.calculadoraTest.utils;

// Esto es una clase ADOC, para documentar
public class ApiResponse {

    private String message;
    private Object data;

    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

}
