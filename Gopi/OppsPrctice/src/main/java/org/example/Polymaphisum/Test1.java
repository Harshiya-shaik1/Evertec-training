package org.example.Polymaphisum;

public class Test1 {
    public void m1(Animal a){
        System.out.println("Animal version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey version");
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        Animal a=new Animal();
        t.m1(a);//Animal version
        Monkey m=new Monkey();
        t.m1(m);//Monkey version
        Animal am=new Monkey();
        t.m1(am);//Animal version
    }

}

