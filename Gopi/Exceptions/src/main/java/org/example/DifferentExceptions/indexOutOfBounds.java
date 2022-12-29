package org.example.DifferentExceptions;

public class indexOutOfBounds {
    public static void main(String[] args) {
        //Array indexOutOfBounds Exception
        try {
            int[] a = new int[2];
            a[2] = 14;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}
