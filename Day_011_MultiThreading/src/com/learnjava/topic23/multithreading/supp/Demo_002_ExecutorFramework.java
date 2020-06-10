/*
 * Pool Of thread creation with 5 threads .
 */

package com.learnjava.topic23.multithreading.supp;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo_002_ExecutorFramework {

	public static void main(String[] args) {
		/*
		 * ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
		 * fixedThreadPool.submit(new PrintNumbers()); fixedThreadPool.submit(new
		 * PrintNumbers()); fixedThreadPool.submit(new PrintNumbers());
		 * fixedThreadPool.submit(new PrintNumbers()); fixedThreadPool.submit(new
		 * PrintNumbers()); fixedThreadPool.submit(new PrintNumbers());
		 * 
		 * fixedThreadPool.shutdown();
		 */
		 
		 
		 ExecutorService fixedEvenThreadPool = Executors.newFixedThreadPool(5); // Creating the Thread pool .
		 
		 Queue<PrintEvenNumbers> jobQueue = new LinkedBlockingQueue<>(); // Creating the Job Pool 
		 List<Future<Integer>> invokeAll =null;
		 jobQueue.add(new PrintEvenNumbers());
		 jobQueue.add(new PrintEvenNumbers());
		 jobQueue.add(new PrintEvenNumbers());
		 jobQueue.add(new PrintEvenNumbers());
		 jobQueue.add(new PrintEvenNumbers());
		 jobQueue.add(new PrintEvenNumbers()); // Adding to the job pool .
		 
		 try {
			 invokeAll = fixedEvenThreadPool.invokeAll(jobQueue); // invoking all at one go .
			
			invokeAll.forEach(x->{
				try {
					System.out.println(x.get());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 fixedEvenThreadPool.shutdown();
		 		 

	}
	

}


