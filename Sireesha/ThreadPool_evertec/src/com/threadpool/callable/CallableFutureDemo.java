package com.threadpool.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] job= {new MyCallable(10),
				           new MyCallable(20),
				           new MyCallable(30),
				           new MyCallable(40),
				           new MyCallable(50),
				           new MyCallable(600) };
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(MyCallable jobs:job) {
			Future f=service.submit(jobs);
			System.out.println(f.get());
				          
		                     
		}
		service.shutdown();

	}

}
