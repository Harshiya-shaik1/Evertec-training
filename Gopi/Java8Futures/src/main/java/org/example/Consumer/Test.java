package org.example.Consumer;

import java.util.function.Consumer;

public class Test {


    public static void main(String[] args) {
        Consumer<String> c=s-> System.out.println(s);
             c.accept("hello");
             c.accept("hi");

    }
}
