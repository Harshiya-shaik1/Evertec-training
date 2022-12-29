package org.example;

import java.time.LocalDateTime;

public class previousDates {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1998, 05, 06, 12, 06, 2);
        System.out.println(dt);
        System.out.println("After six monts"+dt.plusMonths(6));
        System.out.println("before six months"+dt.minusMonths(6));

    }
}
