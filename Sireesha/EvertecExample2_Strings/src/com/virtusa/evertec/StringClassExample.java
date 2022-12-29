package com.virtusa.evertec;



public class StringClassExample {
	public static void method1(String s) {
		s=s+"programming";
		
		
	}
	public static void method2(StringBuffer s1) {
		s1=s1.append("programming");
		}
	

	public static void main(String[] args) {
		String s="java";
		method1(s);
		System.out.println(s);
		StringBuffer s1=new StringBuffer("sql");
		method2(s1);
		System.out.println(s1);
		
	}

	
}