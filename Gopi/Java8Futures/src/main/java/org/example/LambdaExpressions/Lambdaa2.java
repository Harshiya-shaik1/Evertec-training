/*
package org.example.LambdaExpressions;
interface Interf2{
    public void add(int a, int b);
}
class Demo2 implements Interf2{

    @Override
    public void add(int a, int b) {
        System.out.println("the sum of "+(a +b));
    }
}
public class Lambdaa2 {
    public static void main(String[] args) {

        Interf2 i =new Demo2();
        i.add(10,20);
    }
}
*/

//with lambda Expressions
package org.example.LambdaExpressions;
interface Interf2{
    public void add(int a, int b);
}


public class Lambdaa2 {
    public static void main(String[] args) {

        Interf2 i =(a,b)-> System.out.println("the sum of  "+(a+b));
        i.add(10,20);
        i.add(30,50);
    }
}

