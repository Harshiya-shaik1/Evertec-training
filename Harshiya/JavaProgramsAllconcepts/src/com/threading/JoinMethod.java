package com.threading;


	
	
	import java.io.*;    
	class ThreadJoin extends Thread  
	{   
	public void run()  
	{  
	for (int j = 0; j < 1; j++)  
	{  
	try  
	{   
	Thread.sleep(300);  
	System.out.println("The current thread name is: " + Thread.currentThread().getName());  
	}  
	catch(Exception e)  
	{  
	System.out.println("The exception has been caught: " + e);  
	}  
	System.out.println( j );  
	}  
	}  
	}  
	  
	public class JoinMethod {  
	public static void main (String argvs[])  
	{   
	ThreadJoin th1 = new ThreadJoin();  
	ThreadJoin th2 = new ThreadJoin();  
	ThreadJoin th3 = new ThreadJoin();  
	   
	th1.start();  
	  
	// starting the second thread after when  
	// the first thread th1 has ended or died.  
	try  
	{  
	System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
	  
	// invoking the join() method  
	th1.join();  
	}  
	  

	catch(Exception e)  
	{  
	System.out.println("The exception has been caught " + e);  
	}  
	  
	// thread th2 starts  
	th2.start();  
	  
	// starting the th3 thread after when the thread th2 has ended or died.  
	try  
	{  
	System.out.println("The current thread name is: " + Thread.currentThread().getName());  
	th2.join();  
	}    

	catch(Exception e)  
	{  
	System.out.println("The exception has been caught " + e);  
	}    
	th3.start();  
	}  
	}  
	


