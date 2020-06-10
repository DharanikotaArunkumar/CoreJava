/*
 *  pre decrement / post decrement operator
 */
package com.learnjava.topic6.operators;

public class Demo_038_Operators_Unary_3 {

	public static void main(String[] args) {
		int number =1;
		int number1 =--number;
		System.out.println("pre decreament value "+number1);
		
		
		System.out.println("----------------------------");
		
		int num =1;
		int num1 =num--;
		System.out.println("post decreament value "+num1);
		
		System.out.println("----------------------------");
		
		int a =1;
		System.out.println("value of is "+a);
		System.out.println("value of is "+ --a);
		System.out.println("value of is "+a);
		
		System.out.println("----------------------------");
		
		int b =1;
		System.out.println("value of is "+b);
		System.out.println("value of is "+ b--);
		System.out.println("value of is "+b);
		
		
	}

}
