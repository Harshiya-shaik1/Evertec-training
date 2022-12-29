package com.virtusa.traverse;

import java.util.ArrayList;

public class forEachDemo {
	public static void main(String [] args) {
		ArrayList<String> l1=new ArrayList<>();
		l1.add("java");
		l1.add("python");
		l1.add("sql");
		l1.add("Angular");
		for(String a:l1) {
			System.out.println(a);
		}
	}
	
	

}
