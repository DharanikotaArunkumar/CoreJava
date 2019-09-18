package com.learnjava.topic23.multithreading.supp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Demo_003_ExecutorFramework {
	
	
	public static void main(String[] args) {
		
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
		ScheduledFuture<Integer> schedule = executorService.schedule(new PrintEvenNumbers(), 1, TimeUnit.MINUTES);
		executorService.shutdown();
	}

}
