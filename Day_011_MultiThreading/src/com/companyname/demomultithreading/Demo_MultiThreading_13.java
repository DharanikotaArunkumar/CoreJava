package companyname.demomultithreading;

// Join() method gives an advantage of ordring the threads 
public class Demo_MultiThreading_13 {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Main-Thread");		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Thread t1 =new MyProjectThread10();
		t1.setName("T1-Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		
		Thread t2 =new MyProjectThread10();
		t2.setName("T2-Thread");
		t2.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
			}
		
}

}


class MyProjectThread10 extends Thread {

public void run() {  
for (int i = 1; i <= 100; i++) {
	System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
	}

}
}
