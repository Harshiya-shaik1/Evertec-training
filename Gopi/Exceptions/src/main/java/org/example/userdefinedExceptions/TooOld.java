package org.example.userdefinedExceptions;

public class TooOld extends RuntimeException {
    public TooOld(String s) {
        super(s);
    }
}
