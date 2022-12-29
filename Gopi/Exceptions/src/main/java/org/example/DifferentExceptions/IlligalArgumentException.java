package org.example.DifferentExceptions;

public class IlligalArgumentException {
    public static void main(String[] args) {
        Thread t=new Thread();//threadperiorities(1-10)
        t.setPriority(12);
    }
}
