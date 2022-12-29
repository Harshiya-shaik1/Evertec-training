package org.example.userdefinedExceptions;

public class TooYoungException extends RuntimeException {
    public TooYoungException(String s) {
        super(s);
    }
}
