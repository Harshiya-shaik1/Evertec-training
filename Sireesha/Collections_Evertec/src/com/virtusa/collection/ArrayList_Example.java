package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayList_Example {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(30);
		a.add(10);
		a.add(30);
		a.add(0, 7);
		a.add(null);//[7,30,10,30,null]
		a.add(3, 3);
		a.add(99);//[7,30,10,3,30,null,99]
		System.out.println(a);
		ArrayList<String> letters = new ArrayList<>();  
		letters.add("A");  
		letters.add("B");  
		letters.add("C");
		letters.add(0, "Sireesha");
		System.out.println(letters);      
		ArrayList<String> words = new ArrayList<>();  
		words.add("Apple");  
		words.add("Ball");  
		words.add("Cat");  
		System.out.println(words);
		System.out.println();
		System.out.println (letters.addAll(words));   
		System.out.println(letters);    
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println(letters.addAll(fruits));
		
	}

}
