/*
 * writing the same method using lambda expression.
 */

package com.learnjava.topic38.lambdaexpression;

public class Demo_LambdaExpression_309 {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("Thread is Running ...");
		};
		Thread thread = new Thread(r);
		thread.start();

		/*
		 * Runnable r = new Runnable() {
		 * 
		 * @Override public void run() { System.out.println(
		 * " Thread is Running Task");
		 * 
		 * } };
		 */
	}

}
