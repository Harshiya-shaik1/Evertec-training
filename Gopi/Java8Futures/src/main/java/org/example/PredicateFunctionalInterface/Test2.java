package org.example.PredicateFunctionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        Predicate <String> p=s -> s.length()>5;
        System.out.println(p.test("gopi"));//false
        System.out.println(p.test("krishna"));//true


        Predicate <Collection> p1= C->C.isEmpty();
        ArrayList l=new ArrayList();
        l.add("gopi");
        l.add("krishna");
        System.out.println(p1.test(l));//false
        ArrayList l1=new ArrayList();
        System.out.println(p1.test(l1));//true
    }
}
