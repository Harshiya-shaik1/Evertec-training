package com.virtusa.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Example {
     public static void main (String [] args) {
    	 List<String> names=new LinkedList<>();
    	 names.add("Sireesha");
    	 names.add("Azan");
    	 names.add("Gopi");
    	 names.add(1, "Masthanbi");
    	 names.add("Sireesha");
    	 System.out.println(names);
    	 LinkedList<String> addName=new LinkedList<>();
    	 addName.add("Harshiya");
    	 addName.add("vamshi");
    	 addName.add(1, null);
    	 System.out.println(addName);
    	System.out.println( names.addAll(addName));
    	System.out.println(names);
    	addName.addFirst("Evertec");
    	System.out.println(addName);
    	addName.addLast(null);
    	System.out.println(addName);
    	System.out.println(addName.addAll(1, names));
    	System.out.println(addName);
    	System.out.println(addName.remove());
    	System.out.println(addName);
    	Iterator t1=addName.iterator();
    	while(t1.hasNext()) {
    		System.out.println(t1.next());
    	}
    	
    	 
     } 
}
