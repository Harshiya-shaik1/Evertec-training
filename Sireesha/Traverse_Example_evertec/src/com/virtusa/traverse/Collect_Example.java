package com.virtusa.traverse;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect_Example {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(5);
		a.add(10);
		a.add(30);
		a.add(50);
	    a.add(20);
		a.add(40);
		List< Integer> s1=a.stream().filter(i->i<=20).collect(Collectors.toList());
		s1.forEach(i->System.out.println(i));
		
		
	}

}
