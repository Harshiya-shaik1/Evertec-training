package org.example.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filer {
    public static void main(String[] args) {
     /*   ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        l.add(30);
        */
        List<Integer> NumberList= Arrays.asList(10,15,20,25,30);
        List<Integer> even_Numbers=new ArrayList<>();
        even_Numbers=NumberList.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even_Numbers);
        //direct Print without Assign new
        NumberList.stream().filter(e->e%2==0).forEach(System.out::println);
        NumberList.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));

    }
}
