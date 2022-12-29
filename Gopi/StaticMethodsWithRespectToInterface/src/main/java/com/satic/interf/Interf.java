package com.satic.interf;

public interface Interf {
    public static void m1(){
        System.out.println("static method");
    }
}
class Test implements Interf{
    public static void main(String[] args) {
        Test t1=new Test();
      //  Test.m1();CE
       // t1.m1();
        Interf.m1();
    }
}
