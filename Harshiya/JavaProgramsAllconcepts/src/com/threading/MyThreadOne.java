package com.threading;

public class MyThreadOne implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+"i = "+i);
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
