package com.virtusa.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {
	public static void main(String args[]){  
	 HashSet<String> set=new HashSet();  
     set.add("One");    
	 set.add("Two");    
	 set.add("Three");   
	 set.add("Four");  
	 set.add("Five"); 
	 System.out.println(set);
	System.out.println( set.contains("Five"));
	System.out.println(set.isEmpty());
	System.out.println(set.remove("Three"));
	System.out.println(set);
	System.out.println(set.size());
	set.clear();
	System.out.println(set);
	
}
}
