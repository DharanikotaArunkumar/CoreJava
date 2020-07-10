/*
 * Functional interface :- Any interface has one abstract method then its called as functional interface
 * 
 * Its also called as SAM ( Single Abstract method ) interface.
 * 
 * 
 * This can be represented by lambda expression .
 * 
 * Why we need functional interface .
 * 
 * 1) to shorten the code written 
 * 2) to avoid additional class creation .
 * 3) to give more flexibility to write the code interfaces with single method.
 */
package com.learnjava.topic37.functionalinterface;

public class Demo_Functional_Interface_300_withOut {

	public static void main(String[] args) {
		
		
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" Thread is Running Task");
				
			}
		};
	

		Thread thread = new Thread(r);
		thread.start();
		
	}

}

