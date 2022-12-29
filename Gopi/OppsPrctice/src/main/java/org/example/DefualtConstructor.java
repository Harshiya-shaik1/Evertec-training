package org.example;

public class DefualtConstructor {
    int id;
    String name;

    public DefualtConstructor() {
        this.id=1;
        this.name="gopi";
    }

    public static void main(String[] args) {
        DefualtConstructor c=new DefualtConstructor();
        System.out.println( c.id);
        System.out.println(c.name);

    }
}
