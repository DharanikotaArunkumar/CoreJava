package com.learnjava.topic23.multithreading;

//Daemon  thread :- when the main thread is ended child threads will get end those type of 
// threads are called Daemon Threads .
//Daemon Threads are like a supporting Threads to the Application .
// In Eclipse spell checker ,is like daemon Thread when i will be supporting eclipse and ended when 
// eclipse is closed .

public class Demo_MultiThreading_020 {

	public static void main(String[] args) {
		
				Thread.currentThread().setName("Main-Thread");		
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
				
				Thread t1 =new MyProjectThread26();
				t1.setName("T1-Thread");
				t1.setPriority(Thread.MIN_PRIORITY);
				t1.setDaemon(true);
			
				
			
				
				
				
				Thread t2 =new MyProjectThread26();
				t2.setName("T2-Thread");
				t2.setPriority(Thread.NORM_PRIORITY);
				
				
				t1.start();
				t2.start();
				
				for (int i = 1; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
					}
				
	}

}


class MyProjectThread26 extends Thread {

	public void run() {  
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
			}

	}
}