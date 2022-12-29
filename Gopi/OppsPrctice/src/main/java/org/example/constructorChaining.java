package org.example;

public class constructorChaining {

    constructorChaining(){
        this(5);
    }
    constructorChaining(int s){
        this(5,10);
    }
    constructorChaining(int x,int s){
        System.out.println(s+" ,"+x);
    }

    public static void main(String[] args) {
        constructorChaining c=new constructorChaining();

    }
}
