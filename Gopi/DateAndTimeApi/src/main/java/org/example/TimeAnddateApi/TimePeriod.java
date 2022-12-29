package org.example.TimeAnddateApi;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {
    public static void main(String[] args) {
        LocalDate Dob=LocalDate.of(1998,02,12);
        LocalDate today=LocalDate.now();
        Period p=Period.between(Dob,today);
        System.out.println("year"+p.getYears()+"months"+ p.getMonths()+" days"+p.getDays());
    }
}
