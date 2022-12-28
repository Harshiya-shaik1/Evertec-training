package com.strings;

	
	
	import java.lang.String;
	public class StringMethods {
	//length()
	    public static void main(String[] args) {
	   String str = "Hello World";
	   System.out.println(str.length());
	        //concatination
	   String str1 = "SoftwareTesting";
	   String str2 = "Testing";
	   System.out.println(str1 + str2);
	   System.out.println(str1.concat(str2));
	   
	   //tocharArray
	   String st = "Hello";
       char[] chars = str.toCharArray();
       System.out.println(chars);
       for (int i= 0; i< chars.length; i++) {
           System.out.println(chars[i]);
       }
       
       //compareTo
      
       String str3 = "American";
       String str4 = "Indian";
        
       System.out.println(str1.compareTo(str2));
       System.out.println(str3.compareTo(str4));
      
	 //contains
       System.out.println( str1.contains(str2));
       System.out.println( str.contains(str2));
       
     //split()
       String str5 = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
       String[] split = str.split("xyz");
        
       for (String obj: split) {
           System.out.println(obj);
       }
       //indexOf()
       System.out.println(str);
       System.out.println("index of 'l' is " + str.indexOf('l'));
       
       //substring()
     
       System.out.println(str1.substring(8,12));
       
       //replace
       String str6 = "Arshiya Shaik";
       String str7 = str6.replace("Arshiya","Shake");
       System.out.println(str6);
       System.out.println(str7);
       
       //trim()
       String s1="  hello string   ";  
       System.out.println(s1+"world");//without trim()  
       System.out.println(s1.trim()+"world");//with trim()  

       
   }
	        
	    }
	


