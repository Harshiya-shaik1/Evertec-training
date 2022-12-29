package org.example.map;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2);
        List<Integer> l2= Arrays.asList(3,4);
        List<Integer> l3= Arrays.asList(5,6);
        List<List<Integer>> finalList=Arrays.asList(l1,l2,l3);


        finalList.stream().flatMap(x->x.stream()).forEach(System.out::println
        );
    }
}
