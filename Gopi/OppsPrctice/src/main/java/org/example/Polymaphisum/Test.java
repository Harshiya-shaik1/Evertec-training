package org.example.Polymaphisum;

public class Test {
    public static void main(String[] args) {
        P p=new P();
        p.marry();//parent class    ->Lakshi
        P.C c=new P.C();
        c.marry();//child methods    ->geeta/sam/junny/cutie
        P p1=new P.C();
        p1.marry();//child method     ->geeta/sam/junny/cutie
    }
}
