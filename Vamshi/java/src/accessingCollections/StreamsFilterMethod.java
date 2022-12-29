package accessingCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterMethod {
	public static void main(String[] args)
    {
 
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
 
        // First lets print the collection
        System.out.println("Printing the collection : "+ al);
                           
 Predicate<Integer> modtwofn=i-> (i % 2 == 0);
 
        List<Integer> ls
            = al.stream()
                  .filter(i -> modtwofn.test(i) )
                  //.map(i->Integer::toString i() )
                  .collect(Collectors.toList()); //terminal operation
        al.stream().forEach( System.out::println);
 
        System.out.println(
            "Printing the List after stream operation : "+ ls);
            
    }

}
