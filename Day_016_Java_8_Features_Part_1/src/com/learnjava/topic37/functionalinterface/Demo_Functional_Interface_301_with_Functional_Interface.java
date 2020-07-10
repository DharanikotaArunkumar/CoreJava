/*
 * writing the same method using lambda expression.
 */

package com.learnjava.topic37.functionalinterface;

public class Demo_Functional_Interface_301_with_Functional_Interface {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			System.out.println("Thread is Running ...");
		};
		Thread thread = new Thread(r);
		thread.start();

		/*
		 * Runnable r = new Runnable() {
		 * 
		 *  () -> { System.out.println(
		 * " Thread is Running"); } };
		 */
	}

}
