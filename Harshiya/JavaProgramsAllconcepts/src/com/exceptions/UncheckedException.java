package com.exceptions;

public class UncheckedException {
	public static void main(String[] args) {
		show();
		System.out.println("Reached end of main method");
	}
	
	
	
	public static void show() {
		int a=10;
		int b=0;
		int divval=0;
		int arr[]= {2,3,4,5};
		String str=null;
		try {
			//divval=a/b;//AE
			//System.out.println(arr[5]);//AIOBE
		
			try {
				System.out.println("Hello");
			//System.out.println(str.length());//NPE
			}
			
			catch(NullPointerException e) {
				System.out.println("NullPointer exception encountrted in show(): "+e.getMessage());
			}
				
			try {
				System.out.println(arr[5]);
			}
			finally {
				System.out.println("Reached end of file block for arrayindexoutofbounds");
			}
			}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception encountrted in show(): "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException encountered in show(): "+e.getMessage());
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointer exception encountrted in show(): "+e.getMessage());
			
			
		}
		System.out.println("Reached end of show method");
			}
	}




