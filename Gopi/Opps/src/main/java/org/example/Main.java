package org.example;

public class Main {
    public static void main(String[] args) {

        loop(1,10);
        System.out.println("***************");
        loop(20,30);
        System.out.println("************");
        loop(50,60);
    }
    public static void loop(int step,int finalValue){
        while(step<=finalValue){
            System.out.println(step);
            step++;
        }

    }
}