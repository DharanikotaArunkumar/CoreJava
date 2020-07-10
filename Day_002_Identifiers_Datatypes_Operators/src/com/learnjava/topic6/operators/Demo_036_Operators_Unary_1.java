/*
 * unary minus (-), unary plus (+) operator
 */
package com.learnjava.topic6.operators;

public class Demo_036_Operators_Unary_1 {

	public static void main(String[] args) {
		
		// unary operators works on only operand only ,we have 3 unary operators 
		
		//1) unary minus (-)
		//2) increment (++)
		//3) decrement (--)
		//4) unary plus (+) indicates the positive 
		
		int stockPriceChange =+250;
		System.out.println("stock price  change today "+stockPriceChange);
		
		
		stockPriceChange =250;
		System.out.println("stock price  change today "+(-stockPriceChange));
		
		int number =120;
		System.out.println("number value :  "+(-(-(number))));
		

	}

}
