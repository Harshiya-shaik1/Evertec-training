package com.exceptions;

public class UserDefined {
	public static void main (String[] args) {
		try {
		vote(12);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
public static void vote(int age) throws InvalidAgeException
{
	
	//int age = 0;
	if(age<18) {
		throw new InvalidAgeException("Not eligibe for voting");
		
	}
	else {
		System.out.println("ELigible for voting");
	}
}
}
