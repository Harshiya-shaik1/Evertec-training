package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

//Implement Comparable to sort Employee on basis of Name, Salary and joining Date
class Employee implements Comparable<Employee> {
    String name;
    Integer salary;
    Date joiningDate;

    public Employee() {
    }

    public Employee(String n, Integer f, Date d) {
        name = n;
        salary = f;
        joiningDate = d;
    }

    public String toString() {
        return "\n name=" + name + ",salary=" + salary + ",JoiningDate="
                + joiningDate;
    }

    public int compareTo(Employee o) {
        return this.name.compareTo(o.name) + (this.salary.compareTo(o.salary))
                + (this.joiningDate.compareTo(o.joiningDate));
    }
}

public class EmployeeSort {

    public static void main(String[] args) {

        Employee emp1 = new Employee("ank", 2000, new Date(2016 - 1900, 11, 14));
        Employee emp2 = new Employee("dav", 500, new Date(2016 - 1900, 11, 23));
        Employee emp3 = new Employee("ank", 1000, new Date(2016 - 1900, 11, 22));
        Employee emp4 = new Employee("sam", 9000, new Date(2016 - 1900, 11, 29));
        Employee emp5 = new Employee("ank", 1000, new Date(2016 - 1900, 11, 19));

        List<Employee> l = new ArrayList<Employee>();
        l.add(emp1);
        l.add(emp2);
        l.add(emp3);
        l.add(emp4);
        l.add(emp5);

        Collections.sort(l); // SORT

        System.out.println(l); // Display list

    }

}
