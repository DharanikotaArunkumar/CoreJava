package companyname.demomultithreading;

// Sleep method is used to pause the execution of that thread for some time.
public class Demo_MultiThreading_17 {

	public static void main(String[] args) {
			Thread t1 = new MyProjectThread17(); 
			Thread t2 = new MyProjectThread17(); 
			t1.start(); 
			t2.start();
			
			for (int i = 1; i <= 1000; i++) {
				
				System.out.println("Value of i is : " + i);

			}
			
		}

	}


	class MyProjectThread17 extends Thread {

		public void run() {  
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Value of i is in my thread : " + i);

			}

		}
	}
