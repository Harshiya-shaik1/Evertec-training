package org.example.inheritance;

public class Test {
    public static void main(String[] args) {
        P p=new P();
        p.m1();//parent
      //  p.m2();    //java: cannot find symbol    symbol:   method m2()   location: variable p of type org.example.inheritance.P



        C c=new C();
        c.m1();//parent
        c.m2();//chaild



        P p1=new C();
        p1.m1();//parent
        //p1.m2();////java: cannot find symbol    symbol:   method m2()   location: variable p of type org.example.inheritance.P1



       // C c1=new P();// compile time error found P ,requide C

    }
}
