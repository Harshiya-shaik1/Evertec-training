package com.work.encapsulation;

public class Hello {
    public static void main(String[] args) {

        Person Jhon = new Person();
        System.out.println(Jhon);
        Person pooja=new Person("pooja",26,"female");
        System.out.println(pooja);
        pooja.setName("jhothi");
        pooja.setAge(30);
        System.out.println(pooja);

    }
}
