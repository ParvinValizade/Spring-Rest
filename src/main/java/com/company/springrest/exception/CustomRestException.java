package com.company.springrest.exception;

import com.company.springrest.enums.ErrorCodeEnum;

public class CustomRestException extends RuntimeException{

    public CustomRestException(String message) {
        super(message);
    }

    public CustomRestException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
    }
}
