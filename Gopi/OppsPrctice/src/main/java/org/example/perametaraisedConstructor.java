package org.example;

public class perametaraisedConstructor {
    int id;
    String name;

    public perametaraisedConstructor(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public static void main(String[] args) {
        perametaraisedConstructor p=new perametaraisedConstructor(1,"gopi");
        System.out.println(p.id);
        System.out.println(p.name);
    }
}
