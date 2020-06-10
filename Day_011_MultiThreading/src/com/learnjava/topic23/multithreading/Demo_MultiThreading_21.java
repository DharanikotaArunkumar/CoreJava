package com.learnjava.topic23.multithreading;

// Creating the Thread by using Runnable interface

public class Demo_MultiThreading_21 {

	public static void main(String[] args) {
		
		MyprojectRunnable obj =new MyprojectRunnable();
		obj.run();
		
		Thread t1 =new Thread(obj);
		//t1.start();

	}

}


class MyprojectRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i is : " + i);

		}
	}
	
}