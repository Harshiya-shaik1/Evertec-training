package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ExecutorDemo {
	public static void main(String[] args) {
		PrintJob[] jobs= {new PrintJob("Ravi"),
				          new PrintJob("ramu"),
		                  new PrintJob("Anil"),
		                  new PrintJob("Sunil"),
		                  new PrintJob("Suresh"),
		                  new PrintJob("Naresh")};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs) {
			service.submit(job);
			
		}
		System.out.println(service.isShutdown());
		service.shutdown();
	}

}
