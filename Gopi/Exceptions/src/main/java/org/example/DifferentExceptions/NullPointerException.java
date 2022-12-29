package org.example.DifferentExceptions;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (java.lang.NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
