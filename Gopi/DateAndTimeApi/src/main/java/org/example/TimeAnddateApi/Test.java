package org.example.TimeAnddateApi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int year=date.getYear();
        System.out.println("date: "+dd+"  "+"month: "+mm+"  year: "+year);
        int hur=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        System.out.println("hur"+hur+"mint: "+min+"  sec: "+sec);
    }
}
