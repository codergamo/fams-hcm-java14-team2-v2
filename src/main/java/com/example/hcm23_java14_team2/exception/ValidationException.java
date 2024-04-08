package com.example.hcm23_java14_team2.exception;

import java.util.Map;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }

    private Map<String, String> errors;

    public ValidationException(Map<String, String> errors) {
        super("Validation failed");
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

}
