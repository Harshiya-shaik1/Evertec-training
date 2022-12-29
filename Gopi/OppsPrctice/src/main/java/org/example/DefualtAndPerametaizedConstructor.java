package org.example;

public class DefualtAndPerametaizedConstructor {
    int id;
    String name;

    public DefualtAndPerametaizedConstructor() {
        this.id=1;
        this.name="gopi";
    }

    public DefualtAndPerametaizedConstructor(int id,String name) {
        this.id = id;
        this.name=name;

    }

    @Override
    public String toString() {
        return "DefualtAndPerametaizedConstructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DefualtAndPerametaizedConstructor dp=new DefualtAndPerametaizedConstructor();
        System.out.println("defualt constructor "+dp);
        DefualtAndPerametaizedConstructor dp1=new DefualtAndPerametaizedConstructor(1,"krishna");
        System.out.println("perametaraisedConstructor"+ dp1);




    }
}
