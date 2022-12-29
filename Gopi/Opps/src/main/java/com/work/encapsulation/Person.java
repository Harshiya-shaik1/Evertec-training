package com.work.encapsulation;

public class Person {
  private    String name;
  private int age;
    private   String gender;
    public Person() {
        this.name = "Gopi";
        this.age=22;
        this.gender="Male";
    }

    public Person(String name,int age, String gender) {
        this.name = name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean setAge(int age) {
        if(age>=0 && age<100){
            this.age=age;
            return  true;
        }
        return false;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
