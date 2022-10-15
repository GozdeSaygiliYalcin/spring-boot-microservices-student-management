package com.gozdesy.exception;

import lombok.Getter;
@Getter
public class StudentException extends RuntimeException{

    private final ErrorType errorType;

    public StudentException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public StudentException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
