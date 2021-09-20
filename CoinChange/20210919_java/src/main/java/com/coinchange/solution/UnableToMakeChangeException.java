package com.coinchange.solution;

public class UnableToMakeChangeException extends RuntimeException {
    public UnableToMakeChangeException(String message) {
        super(message);
    }
}
