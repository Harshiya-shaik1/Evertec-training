package org.example;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getDateOfBirth()==e2.getDateOfBirth()){
            return e1.getName().compareTo(e2.getName());

        }
        return e1.getDateOfBirth().compareTo(e2.getDateOfBirth());
    }
    }

