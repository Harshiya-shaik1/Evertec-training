package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> nmaes= Arrays.asList("Gopikrishna","anantapur","hyd","kadapa","madu","tharun");
        List<String> Long_names=nmaes.stream().filter(s->s.length()>=5 && s.length()<8).collect(Collectors.toList());
        System.out.println(Long_names);
        nmaes.stream().filter(s->s.length()>=5 && s.length()<8).forEach(s-> System.out.println(s));
        nmaes.stream().filter(s->s.length()>=5 && s.length()<8).forEach(System.out::println);
    }
}
