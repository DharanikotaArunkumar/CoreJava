/*
 * This program is about the short hand notation 
 */
package com.learnjava.topic6.operators.selfstudy;

public class Demo_040_Operators_Assignment {

	public static void main(String[] args) {
		int x, y;

		// short hand notation of assignment variable (operator)=variable;
		x = 100;
		y = 100;

		x = x + y;

		// x *=y;// ==> x = x*y
		// System.out.println("value of x is in short hand notation of (x=x*y)
		// "+x);
		x += y; // ==> x= x+y;
		System.out.println("value of x is in short hand notation of (x=x+y) " + x);
		x -= y; // ==> x=x-y;
		System.out.println("value of x is in short hand notation of (x=x-y) " + x);
		x /= y;// ==> x=x/y
		System.out.println("value of x is in short hand notation of (x=x/y) " + x);
		x %= y; // ==> x =x%y;
		System.out.println("value of x is in short hand notation of (x=x%y) " + x);

	}

}
