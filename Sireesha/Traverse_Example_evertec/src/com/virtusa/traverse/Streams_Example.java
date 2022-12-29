package com.virtusa.traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Streams_Example {
	public static void main(String [] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(30);
		a.add(10);
		a.add(30);
		a.add(0, 7);
	    a.add(3, 3);
		a.add(99);
		System.out.println(a);
		Stream<Integer> s=a.stream().filter(x-> x<30);
		s.forEach(x->System.out.println(x));
		Stream<Integer> s1=a.stream().map(i->i*2);
		s1.forEach(i->System.out.println(i));
		
		 
		 
	
}
}
