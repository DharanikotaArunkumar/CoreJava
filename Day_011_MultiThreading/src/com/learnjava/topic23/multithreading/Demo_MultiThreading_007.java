package com.learnjava.topic23.multithreading;

// Can i do activation of thread again ?

public class Demo_MultiThreading_007 {

	public static void main(String[] args) {
		Thread t1 = new MyProjectThread5(); 
		t1.start(); 
		t1.start();
	}

}


class MyProjectThread5 extends Thread {

	public void run() {  
		for (int i = 1; i <= 100; i++) {
			System.out.println("Value of i is : " + i);

		}

	}
}