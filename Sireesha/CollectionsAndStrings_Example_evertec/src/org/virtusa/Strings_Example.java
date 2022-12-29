package org.virtusa;

public class Strings_Example 
 {
	public static void main(String [] args) {
		String s1=new String("Sireesha").intern();
		
		String s3=new String("Sireesha");
		String s2="Sireesha";
		s2.intern();
		String s4="Sireesha";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	
	
		String s5=new String("java");
		String s6=new String("code").intern();
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s6.intern());
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		String Str2="Azan";//Azan
		String Str3="Azan";
		Str2.intern();//Azan
		Str3.intern();
		System.out.println(Str2==Str3);
		String a="india";
		String b="usa";
		String c="india";
		System.out.println(a==c);
		System.out.println(s2==s4);
		String ab="welcome";
		System.out.println(ab.substring(3));
		System.out.println(ab.substring(0, 3));
		System.out.println(ab.contains(c));
		String abc="stop";
		String abcd="spot";
		System.out.println(abcd.contains("sp"));
		String a1=String.join("+","welcome","to","my team");
		System.out.println(a1);
		
	
		
	}
	

}
