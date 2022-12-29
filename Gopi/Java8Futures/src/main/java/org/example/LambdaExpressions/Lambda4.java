package org.example.LambdaExpressions;

/*
    interface  Interf4{
        public int squre(int x);
    }
    class Demo4 implements Interf4{

        @Override
        public int squre(int x) {
            return x * x;
        }
    }
public class Lambda4 {
    public static void main(String[] args) {
        Interf4 i=new Demo4();
        System.out.println( i.squre(20));
        System.out.println(i.squre(30));


    }
}*/
//with lambda

interface  Interf4{
    public int squre(int x);
}

public class Lambda4 {
    public static void main(String[] args) {
        Interf4 i=x->x*x;
        System.out.println( i.squre(20));
        System.out.println(i.squre(30));


    }
}
