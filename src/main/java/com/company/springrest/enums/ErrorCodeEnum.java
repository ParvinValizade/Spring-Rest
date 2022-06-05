package com.company.springrest.enums;

public enum ErrorCodeEnum {
    EMPLOYEE_NOT_FOUND("Can not find employee with given id");

    private String message;

    ErrorCodeEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
