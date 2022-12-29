package com.work.interfaces;

public class Hello {
    public static void main(String[] args) {
        Phone phone=new OnePluse5();
        System.out.println("processor :"  +phone.processor());
        Phone phone1=new Iphone();
        System.out.println("IPhone Processor :"+phone1.processor());

    }
}
