package com.virtusa.evertec;

import java.util.Scanner;

public class StringMethods {

	
	public static void main(String[] args) {
	String Str1="Welcome to evertec ";
	String Str2="Thank you";
	String Str3="Welcome to evertec "; 
	System.out.println(Str1.charAt(0));//W
	System.out.println(Str2.concat(Str1));
	System.out.println(Str2.concat(Str1));
	System.out.println(Str1.compareTo(Str2));
	System.out.println(Str2.compareTo(Str1));
	System.out.println(Str1.substring(11));
	System.out.println(Str1.substring(11, 18));
	System.out.println(Str1.length());
	System.out.println(Str1.contains("Wel"));//true
	System.out.println(Str1.contains("wel"));//false
	System.out.println(Str1.contains("wle"));//false
	System.out.println(Str1.toLowerCase());
	String ab=Str1.toLowerCase();
	System.out.println(ab.contains("wel"));//true
	System.out.println(Str1.toUpperCase());
	System.out.println(Str1.equals(Str2));
	System.out.println(Str1.equals(Str3));
	System.out.println(Str1.isEmpty());
	System.out.println(Str1.concat(Str2));
	System.out.println(Str1.replace("W","z"));
	System.out.println(Str1);
	System.out.println(Str1.indexOf("W"));
	System.out.println(Str1.trim());
	/*
	 * Scanner scn=new Scanner(System.in); System.out.println("enter your name");
	 * String name=scn.next();
	 * System.out.println(String.join(name,"hi "," welcome to the evertec "));
	 */
	String d="system";
	System.out.println(d.indexOf("s"));
	String g=new String("Sireesha");
	g.concat("bhanu");
	System.out.println(g);
	String s9="Hello";
	s9="hi";
	System.out.println(s9);
	
	
	
	
	
	
	}

}
