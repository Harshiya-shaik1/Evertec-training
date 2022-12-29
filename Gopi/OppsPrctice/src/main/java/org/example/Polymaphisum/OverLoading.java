package org.example.Polymaphisum;

public class OverLoading {
    public void m1(){
        System.out.println("no - args");
    }
    public void m1(int x){
        System.out.println("int - args");
    }
    public void m1(int x,int y){
        System.out.println("two int args");
    }
    public void m1(int x,double y,char a){
        System.out.println("different args");
    }

    public static void main(String[] args) {
        OverLoading o=new OverLoading();
        o.m1();
        o.m1(5);
        o.m1(5,4);
        o.m1(5,2.2,'a');

    }

}
