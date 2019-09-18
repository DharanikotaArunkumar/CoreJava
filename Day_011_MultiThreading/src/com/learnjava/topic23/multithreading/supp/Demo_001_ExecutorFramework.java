/*
 * The java.util.concurrent package defines three executor interfaces:

	1) Executor					:-  a simple interface that supports launching new tasks.
	2) ExecutorService  		:-  a sub interface of Executor, which adds features that help manage the life cycle, both of the individual tasks and of the executor itself.
	3) ScheduledExecutorService :-  a sub interface of ExecutorService, supports future and/or periodic execution of tasks.
 */

package com.learnjava.topic23.multithreading.supp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_001_ExecutorFramework {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor(); // Creating the Executors Utill class .
		service.submit(new PrintNumbers()); // Invoking Task
		service.shutdown(); // Shutting down the Task .
	}
}

class PrintNumbers implements Runnable {

	@Override
	public void run() {
		for (int index = 0; index < 10; index++) {
			System.out.println("1");
		}
	}

}

class PrintEvenNumbers implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int index = 0; index < 10; index = index + 2) {
			System.out.println(index);
		}
		return 0;
	}

}

class PrintoddNumbers implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int index = 1; index < 10; index = index + 2) {
			System.out.println(index);
		}
		return 0;
	}

}