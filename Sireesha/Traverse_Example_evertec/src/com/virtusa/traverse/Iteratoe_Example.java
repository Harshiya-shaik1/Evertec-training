package com.virtusa.traverse;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratoe_Example {
	public static void main(String [] args) {
		ArrayList a=new ArrayList();
		a.add(30);
		a.add(10);
		a.add(30);
		a.add(0, 7);
		a.add(null);
		a.add(3, 3);
		a.add(99);
		Iterator< Integer> s1=a.iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		
	}

}
