package com.everteck.test;

public class UserDefinedException extends Exception {
	public String message;

	public UserDefinedException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserDefinedException [message=" + message + "]";
	}

}
