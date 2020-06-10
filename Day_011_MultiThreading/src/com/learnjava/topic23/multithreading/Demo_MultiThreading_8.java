package com.learnjava.topic23.multithreading;

// I can run the run() method no of times


public class Demo_MultiThreading_8 {

	public static void main(String[] args) {
		Thread t1 = new MyProjectThread6(); 
		t1.start(); 
		t1.run();
		t1.run();
	}

}

class MyProjectThread6 extends Thread {

	public void run() {  
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" ,i :"+i);
			}

	}
}