package companyname.demomultithreading;

// Thread Priority :- priority says the importance of the thread or particular task .

//priority been defined in the form int value of scale 1 to 10 
// 1 Means Less Priority 
// 5 means Normal Priority 
//10 means Max Priority

public class Demo_MultiThreading_10 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());// Default
																	// Priority
																	// is 5
																	// always .
		Thread.currentThread().setPriority(8);
		System.out.println(" After Changing the Priority : " + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println(" After Changing Thread.MAX_PRIORITY : " + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println(" After Changing Thread.MIN_PRIORITY : " + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		System.out.println(" After Changing Thread.NORM_PRIORITY : " + Thread.currentThread().getPriority());
		

	}

}
