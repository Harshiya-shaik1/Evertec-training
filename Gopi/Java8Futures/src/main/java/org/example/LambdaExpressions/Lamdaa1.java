package org.example.LambdaExpressions;
//with out lambda Expressions
/*interface Interf1{
    public void m1();

}
class Demo implements Interf1{

    @Override
    public void m1() {
        System.out.println("m1() implementation");
    }
}
public class Lamdaa1 {
    public static void main(String[] args) {
        Interf1 i=new Demo();
        i.m1();


    }
}*/
//with lambda expressions
interface Interf1{
    public void m1();

}


public class Lamdaa1 {
    public static void main(String[] args) {
        Interf1 i=()-> System.out.println("m1() implementation");
        i.m1();


    }
}
