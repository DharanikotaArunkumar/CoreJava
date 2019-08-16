package companyname.demomultithreading;

// JVM Creates the Default thread names for the user defined threads as Thread-0,Thread-1,Thread-2
// We can change the Thread name based on our convince 
// JVM Creates the main method thread with name main, i can change this name ,but not id 
// A Thread Can invoke another thread , here MyProjectThread3(Child Thread) thread is invoked by the main(parent Thread)


public class Demo_MultiThreading_5 {

	public static void main(String[] args) {
		
		System.out.println("Thread Name "+Thread.currentThread().getName());
		System.out.println("Thread Id "+Thread.currentThread().getId());
		
		System.out.println("\n\n");
		
		Thread t1 = new MyProjectThread3();
		t1.setName("MyProjectThread");
		
		t1.start();
		
		System.out.println("Statement 1 ");
		System.out.println("Statement 2 ");
		System.out.println("Statement 3 ");
		System.out.println("Statement 4 ");
		
		System.out.println(" program end :- " + Thread.currentThread().getName());
		

	}

}

class MyProjectThread3 extends Thread {

	public void run() {
		System.out.println("Thread Name is  "+Thread.currentThread().getName());
		System.out.println("Thread Id "+Thread.currentThread().getId());
		
		System.out.println("\n\n");


		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i is : " + i);

		}

	}

}