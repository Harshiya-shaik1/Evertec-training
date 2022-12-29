package com.threads;

public class Thread_ClassB  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}
	public static void main(String[] args) {
		Thread_ClassB ab=new Thread_ClassB();
		Thread bc=new Thread(ab);
		bc.start();
	}

}
