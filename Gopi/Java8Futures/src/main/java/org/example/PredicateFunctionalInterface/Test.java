package org.example.PredicateFunctionalInterface;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> p=I->I>10;
        System.out.println(p.test(100));//true
        System.out.println(p.test(5));//false
    }
}
