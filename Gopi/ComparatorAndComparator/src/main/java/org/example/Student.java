package org.example;

import java.util.*;

public class Student  implements Comparable<Student> {
        private int id;
        private String name;
        private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks=marks;

        }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
        public int compareTo(Student s) {
            if (id == s.id)
                return 0;
            else if (id > s.id) {
                return 1;
            } else {
                return -1;
            }

        }
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        l.add(new Student(101, "jhon",67));
        l.add(new Student(50, "sonny",55));
        l.add(new Student(40, "jin",35));
        l.add(new Student(90, "kamal",24));
        l.add(new Student(25, "goa",85));
        l.add(new Student(25, "train",31));
        l.add(new Student(20,"pavan",29));
        l.add(new Student(20, "madu",29));

        //After removal of duplicates
        Set<Student> s=new TreeSet<>();
        s.addAll(l);
        System.out.println("\n" +s);



        System.out.println("\nbefore sorting "+l);
        Collections.sort(l);
        System.out.println("\nAtfer sorting "+l);

        //customised sorting
        Collections.sort(l,new NameComparator());
        System.out.println(l);







    }
}










