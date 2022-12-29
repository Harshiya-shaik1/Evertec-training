package com.work.abstraction;

public class Hello {
    public static void main(String[] args) {
        Person gopi=new Vegan();
        gopi.speaks();
        gopi.eat();
        System.out.println("*************************");
        Person Jhon=new NonVegan();
        Jhon.speaks();
        Jhon.eat();

    }
}
