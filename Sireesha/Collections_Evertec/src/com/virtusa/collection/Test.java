package com.virtusa.collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		m1();
		System.out.println("main");

	}
	public static void m1() {
		System.out.println("hello");
		m2();
		System.out.println("m1");
	}
	public static void m2() {
		System.out.println(10/0);
		
	}

}
