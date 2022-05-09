package com.tracker.exceptions;

public class EmptyMessageException extends RuntimeException {
    public EmptyMessageException(String message) {
        super(message);
    }
}
