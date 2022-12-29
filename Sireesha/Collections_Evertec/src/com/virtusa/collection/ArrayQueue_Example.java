package com.virtusa.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueue_Example {
	public static void main(String[] args) {
		Queue< String> locations=new ArrayDeque<>();
		locations.add("Anantapur");
		locations.add("karnool");
		System.out.println(locations.add("Kadapa"));
		locations.add("Chithur");
		System.out.println(locations);
		System.out.println(locations.peek());
		System.out.println(locations);
		System.out.println(locations.poll());
		System.out.println(locations);
		System.out.println(locations.remove());
		System.out.println(locations);
		System.out.println(locations.add("Anantapur"));
		System.out.println(locations);
		System.out.println(locations.removeAll(locations));
		System.out.println(locations);
	}

}
