/*
 * Relational Operator
 */
package com.learnjava.topic6.operators;

public class Demo_039_Operators_Relational {

	public static void main(String[] args) {
		// The Name itself says the relational ,which one is big ,small ,equal
		// ,not equal

		// 1) '<' is less than operator
		int x = 120, y = 250;
 
		System.out.println(" is x is less than y ? " + (x < y));

		// 2) '<=' is less than operator
		x = 250;
		System.out.println(" is x is less than or equals to y ? " + (x <= y));

		x = 251;
		System.out.println(" is x is less than or equals to y ? " + (x <= y));

		// 3) '>' is greater than operator
		x = 120;
		y = 250;

		System.out.println(" is x is greater than y ? " + (x > y));

		// 4) '>=' is less than operator

		x = 250;
		System.out.println(" is x is greater than or equals to y ? " + (x >= y));

		y = 251;
		System.out.println(" is x is greater than or equals to y ? " + (x >= y));

		// 5) '==' operator checks for equality ,not =( its for assignment)

		
		System.out.println( "--------------------------------------------");
		x = 250;
		y = 250;
		
		System.out.println( " X value is "+x);
		System.out.println( " Y value is "+y);

		System.out.println(" is x equals to y "+(x==y));
		
		y = 251;
		
		x=y;
		System.out.println( " X value is "+x);
		System.out.println( " Y value is "+y);
		System.out.println(" is x equals to y "+(x==y));
		
		
		System.out.println( "--------------------------------------------");
		
		//6) '!=' operator check whether both not equal 
		
		x = 250;
		y = 250;
		System.out.println(" is x not equals to y "+(x!=y));
		
		y = 251;
		System.out.println(" is x not equals to y "+(x!=y));
		

	}

}
