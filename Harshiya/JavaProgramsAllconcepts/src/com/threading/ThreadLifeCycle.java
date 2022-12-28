package com.threading;

public class ThreadLifeCycle extends Thread {
	
	
		public void run() {//running state
		for(int i=0;i<10;i++) {
		System.out.println("thread methods demo");
		try {
		System.out.println("thread is going to sleep");
		ThreadLifeCycle.sleep(1000);
		 
		System.out.println("thread wake up");
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}//waiting state
		}
		}
		public static void main(String[] args) throws
		InterruptedException {
		ThreadLifeCycle de = new ThreadLifeCycle();//new state
		 
		System.out.println("getstate1"+de.getState());
		 de.start();//runnable state
		System.out.println("getstate2"+de.getState());
		System.out.println("getstate3"+de.getState());
		System.out.println("getstate4"+de.getState());
		System.out.println("thread Name"+de.getName());
		System.out.println("thread Priority"+de.getPriority());
		System.out.println("getstate5"+de.getState());
		}
		}



