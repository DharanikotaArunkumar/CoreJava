package companyname.demomultithreading;

// I can create the multiple threads . How many threads been presently now .

public class Demo_MultiThreading_9 {

	public static void main(String[] args) {
		Thread t1 = new MyProjectThread6(); 
		t1.start(); 
		
		Thread t2 = new MyProjectThread6(); 
		t2.start();
	}

}

class MyProjectThread7 extends Thread {

	public void run() {  
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" ,i :"+i);
			}

	}
}
