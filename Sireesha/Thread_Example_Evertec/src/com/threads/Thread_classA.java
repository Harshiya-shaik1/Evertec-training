package com.threads;

public class Thread_classA  extends Thread{
	 public void run() {
		 //System.out.println("Thread is running");
	 }
	 public static void main(String[] args) {
		 Thread_classA ab=new Thread_classA();
		  ab.start();
	 }

}
