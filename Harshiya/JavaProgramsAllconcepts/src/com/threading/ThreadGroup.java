package com.threading;

class ThreadGroup{

public ThreadGroup(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	MyThreadOne my=new MyThreadOne();
	
	ThreadGroup groupA= new ThreadGroup("Thread Group");
	
	
	Thread t1=new Thread(groupA,my,"T1");
	
}
}
