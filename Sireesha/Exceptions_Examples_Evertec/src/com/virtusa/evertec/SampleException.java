package com.virtusa.evertec;

public class SampleException {
	String name;
    long mobile;
    int age;
    public void save(String name,long mobile,int age) throws InvalidMobileException {
    	String ab=""+mobile;
    	if(ab.length()!=10) {
    		throw new InvalidMobileException("enter 10 digits");
    	}
    	
    }
    public static void main(String[]args) {
    	SampleException s1=new SampleException();
    	try {
    	s1.save("Sireesha", 986624, 20);
    }
    	catch(InvalidMobileException e) {
    		System.out.println(e);
    	}

}
}
