package com.learnjava.topic23.multithreading;

//User defined thread :- Even the main thread is ended child threads are still running those type of 
// threads are called User defined Threads .

public class Demo_MultiThreading_019 {

	public static void main(String[] args) {
				Thread.currentThread().setName("Main-Thread");		
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
				
				Thread t1 =new MyProjectThread25();
				t1.setName("T1-Thread");
				t1.setPriority(Thread.MIN_PRIORITY);
				
				
				Thread t2 =new MyProjectThread25();
				t2.setName("T2-Thread");
				t2.setPriority(Thread.NORM_PRIORITY);
				
				
				t1.start();
				t2.start();
				
				for (int i = 1; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
					}
				
	}

}


class MyProjectThread25 extends Thread {

	public void run() {  
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
			}

	}
}