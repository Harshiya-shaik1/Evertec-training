package com.threading;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public class ThreadPool
	{

	    public static void main(String[] args)
	    {
	        ExecutorService executorService = Executors.newFixedThreadPool(3);
	        for (int i = 0; i < 10; i++)
	        {
	            WorkerThread workerThread = new WorkerThread("Hello " + i);
	            executorService.execute(workerThread);
	        }
	        executorService.shutdown();
	        while (!executorService.isTerminated())
	        {
	            
	        }
	        System.out.println("Finished all threads");
	    }
	}

