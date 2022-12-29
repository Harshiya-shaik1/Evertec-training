package org.example.DifferentExceptions;

public class ClassCastException {
    public static void main(String[] args) {
        try{
           /* String s=new String ("gopi");
            Object o=(String) s;
            System.out.println(o);*///parent to child no ClassCastException
         /*   Object s=new Object ("gopi");
            String o=(Object) s;
            System.out.println(o);*/
        }catch (java.lang.ClassCastException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
