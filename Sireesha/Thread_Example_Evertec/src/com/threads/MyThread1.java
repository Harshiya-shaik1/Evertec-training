package com.threads;

public class MyThread1 {

	public static void main(String argvs[]) {

		Thread t = new Thread("My first thread");

		t.start();

		String str = t.getName();
		System.out.println(str);
	}
}
