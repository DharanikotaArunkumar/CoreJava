package com.learnjava.topic23.multithreading;

/* when ever we call the start method on the Thread run method will be called automatically .
 * 
 * JavaDoc says :- 
 * Causes this thread to begin execution; the Java Virtual Machine
 * calls the <code>run</code> method of this thread.

	void start(){
	somthing;
	}
*/
public class Demo_MultiThreading_003 {

	public static void main(String[] args) {
		Thread t1 = new MyProjectThread1(); //Just created a thread object . Thread is not activated yet
		t1.start(); // Thread is activated now .
		
		
		
		
	}

}


class MyProjectThread1 extends Thread {

	public void run() {  // Did i call this t1.run() method ?
		for (int i = 1; i <= 100; i++) {
			System.out.println("Value of i is : " + i);

		}

	}
}

