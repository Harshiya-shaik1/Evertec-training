package org.example.userdefinedExceptions;

import java.util.Scanner;

public class UserDefinedEcep {
    public static void main(String[] args) {
       /* int age= 80;*//*Integer.parseInt(args[0]);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age");
        int age=sc.nextInt();
        if(age>18){
            throw new TooYoungException("eligible for vote");
        } else if (age<18) {
            throw new TooOld("not eligible for vote");

        }
        else {
            System.out.println("************");
        }
    }
}
