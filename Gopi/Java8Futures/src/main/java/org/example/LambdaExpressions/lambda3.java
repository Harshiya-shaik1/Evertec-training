/*
package org.example.LambdaExpressions;


interface Interf3{
    public int getLength(String s);//finding String len
}
class Demo3 implements Interf3{

    @Override
    public int getLength(String s) {
        return s.length();
    }
}
public class lambda3 {
    public static void main(String[] args) {
        Interf3 i=new Demo3();
      System.out.println( i.getLength("gopikrishna"));
        System.out.println(    i.getLength("anantapur"));
    }
}
*/
//lambda Expressions
package org.example.LambdaExpressions;


interface Interf3{
    public int getLength(String s);//finding String len
}


public class lambda3 {
    public static void main(String[] args) {
        Interf3 i=( s)->s.length();
        System.out.println( i.getLength("gopikrishna"));
        System.out.println(    i.getLength("anantapur"));
    }
}
