package com.learnjava.topic23.multithreading;

// Thread Priority Example while running the program. high prority will be completed sooner .

public class Demo_MultiThreading_012 {

	public static void main(String[] args) {
				Thread.currentThread().setName("Main-Thread");		
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
				
				Thread t1 =new MyProjectThread9();
				t1.setName("T1-Thread");
				t1.setPriority(Thread.MIN_PRIORITY);
				
				
				Thread t2 =new MyProjectThread9();
				t2.setName("T2-Thread");
				t2.setPriority(Thread.NORM_PRIORITY);
				
				Thread t3 =new MyProjectThread9();
				t3.setName("T3-Thread");
				t3.setPriority(Thread.MAX_PRIORITY);
				
				
				t1.start();
				t2.start();
				t3.start();
				
				for (int i = 1; i <= 10000; i++) {
					System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
					}
				
	}

}


class MyProjectThread9 extends Thread {

	public void run() {  
		for (int i = 1; i <= 10000; i++) {
			System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
			}

	}
}
