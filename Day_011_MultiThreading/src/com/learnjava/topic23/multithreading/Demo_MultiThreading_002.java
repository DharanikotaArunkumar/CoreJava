package companyname.demomultithreading;

/* 1)Runnable is the super most interface for the threads . it contains only method which is run();
package java.lang;

public interface Runnable {
        public abstract void run();
}*/

/* 2) Thread is a class which implements the Runnable interface .
 * 
 * public class Thread implements Runnable
 * 
 * run method run() in the thread class does not have any business logic to execute
*/

public class Demo_MultiThreading_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new MyProjectThread(); // sub class reference to the super
											// class . creating the Thread
											// object
		t1.start(); // We are making the thread to start
		
		
	MyEmailThread myEmailThread = new	MyEmailThread();
	myEmailThread.start();
		System.out.println(" Current Thread Name :"+Thread.currentThread().getName());
		
		
		System.out.println(" Program Ended......");

	}

}

class MyEmailThread extends Thread {

	public void run() {
		for (int i = 1; i <= 100000; i++) {
			System.out.println("Value of i is : " + i);

		}
	}
}

class MyProjectThread extends Thread {

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(" Current Thread Name :"+Thread.currentThread().getName());
			System.out.println("Value of i is : " + i);

		}

	}
}
