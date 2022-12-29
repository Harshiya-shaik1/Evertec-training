package org.example;

public class ObjectAndClass {
  /* static String name;
    static int id;

    public static void set(String n, int id1) {
       name=n;
       id=id1;

    }
    public static void get(){
        System.out.println("name: "+name);
        System.out.println("id : "+id);

    }


    public static void main(String[] args) {

        ObjectAndClass.set("gopi",202);
        ObjectAndClass.get();
    }*/

    //for instance variables we create object
    String name;
    float salary;

    public static void main(String[] args) {
        ObjectAndClass a=new ObjectAndClass();
        System.out.println(a.name);//null
        System.out.println(a.salary);//0.0
    }
}
