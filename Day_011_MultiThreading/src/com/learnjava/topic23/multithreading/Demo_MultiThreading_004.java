package companyname.demomultithreading;

// Each and every thread will get many properties once they are created .

public class Demo_MultiThreading_4 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Thread Name "+Thread.currentThread().getName());
		System.out.println("Thread Id "+Thread.currentThread().getId());
		System.out.println("Thread priority "+Thread.currentThread().getPriority());
		System.out.println("Thread Class "+Thread.currentThread().getClass());
		System.out.println("Thread"+Thread.currentThread().getState());
		System.out.println();
		
		
		System.out.println("\n\n");


		Thread t1 = new MyProjectThread2();
		t1.start();

		
	}

}

class MyProjectThread2 extends Thread {

	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName());
		System.out.println("Thread Id "+Thread.currentThread().getId());
		System.out.println("Thread priority "+Thread.currentThread().getPriority());
		System.out.println("Thread Class "+Thread.currentThread().getClass());
		System.out.println("Thread"+Thread.currentThread().getState());
				
		System.out.println("\n\n");


		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i is : " + i);

		}

	}

}