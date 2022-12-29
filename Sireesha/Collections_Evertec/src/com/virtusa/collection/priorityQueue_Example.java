package com.virtusa.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue_Example {
	public static void main(String [] args) {
	PriorityQueue<String> languages=new PriorityQueue<String>();  
	languages.add("Telugu");  
	languages.add("English");  
	languages.add("Malayalam");  
	languages.add("Kannada");  
	languages.add("Tamil");  
	System.out.println("head:"+languages.element());  
	System.out.println("iterating the languages elements:");  
	Iterator itr=languages.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	System.out.println(languages.offer("Urdhu"));
	System.out.println(languages);
	System.out.println(languages.peek());
	System.out.println(languages);
	
	System.out.println(languages.poll());
	System.out.println(languages);
	languages.remove();
	System.out.println(languages);
	System.out.println(languages.removeAll(languages));
	System.out.println(languages);
}
}
