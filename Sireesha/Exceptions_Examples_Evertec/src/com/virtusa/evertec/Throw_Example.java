package com.virtusa.evertec;

public class Throw_Example {
	public static void m1(int a) {
		if(a<18) {
			throw new ArithmeticException("not eligible");
		}
		else {
			System.out.println("elegible");
		}
	}
	public static void main(String[] args) {
		Throw_Example.m1(12);
		
	}

}
