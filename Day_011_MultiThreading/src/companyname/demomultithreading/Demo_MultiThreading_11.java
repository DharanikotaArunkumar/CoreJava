package companyname.demomultithreading;
// By default every thread has priority as 5 ,if parent Thread is having any priority then that will 
// be inherited Child . 

public class Demo_MultiThreading_11 {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread t1 =new MyProjectThread8();
		t1.setName("My Thread");
		t1.setPriority(5);
		t1.start();
		

	}

}

class MyProjectThread8 extends Thread {

	public void run() {  
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+","+Thread.currentThread().getPriority()+","+i);
			}

	}
}
