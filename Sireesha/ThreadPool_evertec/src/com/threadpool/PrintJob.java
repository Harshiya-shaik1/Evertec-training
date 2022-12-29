package com.threadpool;

public class PrintJob  implements Runnable{
	String name;
	

	public PrintJob(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println(name+" job started by"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		//System.out.println(name+" job completed by"+Thread.currentThread().getName());
		
	}
	
}