package org.example.FunctionInterface;

import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("find out string length");
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("gopi"));
        System.out.println(f.apply("krishna"));


//squere the inputVaule
        System.out.println("multify input values");
        Function<Integer, Integer> f1 = i -> i * i;
        System.out.println(f1.apply(4));
        System.out.println(f1.apply(5));
    }
}