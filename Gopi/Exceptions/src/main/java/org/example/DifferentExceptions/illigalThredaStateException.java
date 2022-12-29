package org.example.DifferentExceptions;

public class illigalThredaStateException {
    public static void main(String[] args) {
        Thread t=new Thread();
        t.start();
        /*.
        .
        .
         */
        t.start();
    }
}
