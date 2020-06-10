package com.learnjava.topic23.multithreading;

// We can give special features by making the thread to active by starting .
public class Demo_MultiThreading_6 {

	public static void main(String[] args) {
		Thread t1 = new MyProjectThread4();
		//t1.setName(name);
		t1.start(); // On Activation of this code we are making the multi threaded code .else it will be 
					//single threadonly .
		
		t1.run(); // Main Method thread will be executed .
	}

}

class MyProjectThread4 extends Thread {

	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName());// What is the Thread name ?
		
		System.out.println("\n\n");


		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" , i :"+i);// What is the Thread name ?
			

		}

	}

}
