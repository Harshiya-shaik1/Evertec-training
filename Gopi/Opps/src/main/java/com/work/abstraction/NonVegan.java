package com.work.abstraction;

public class NonVegan extends Person{
    @Override
    public void eat() {
        System.out.println("Eats non vegan Food");
    }
}
