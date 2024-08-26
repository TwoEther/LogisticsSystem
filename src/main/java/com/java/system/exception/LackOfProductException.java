package com.java.system.exception;

public class LackOfProductException extends RuntimeException {
    public LackOfProductException(String message) {
        super(message);
    }
}
