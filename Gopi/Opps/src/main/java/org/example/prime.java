package org.example;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        int temp=0 ;
        if (a== 1 || a==0) {
            System.out.println("the num is not a prime");
        } else{
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println("the num not a prime");
                temp = 1;
                break;
            }
        }
            if (temp==0)

                System.out.println("the number is prime");
            }
        }
    }
