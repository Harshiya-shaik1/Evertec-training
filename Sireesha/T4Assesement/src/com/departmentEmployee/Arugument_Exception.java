package com.departmentEmployee;

public class Arugument_Exception extends Exception{
	public String message;

	public Arugument_Exception(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserDefined_Exception [message=" + message + "]";
	}
	

}
