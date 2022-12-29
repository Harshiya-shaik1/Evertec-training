package org.example.map;

import java.util.ArrayList;

class Employee{
    int id;
    String empName;
    int salary;

    public Employee(int id,String empName,int salary) {
        this.id = id;
        this.empName=empName;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class map {
    public static void main(String[] args) {

        ArrayList<Employee> e=new ArrayList<>();
        e.add(new Employee(1,"Gopi",10000));
        e.add(new Employee(2,"madhu",15000));
        e.add(new Employee(3,"vamsi",20000));
        e.add(new Employee(4,"prabha",18000));
        e.add(new Employee(5,"seenu",16000));
        e.add(new Employee(6,"krishna",80000));
        e.add(new Employee(7,"deekshit",50000));


        e.stream().filter(e1->e1.salary>20000).map(e1->e1.salary).forEach(System.out::println);


    }
}

