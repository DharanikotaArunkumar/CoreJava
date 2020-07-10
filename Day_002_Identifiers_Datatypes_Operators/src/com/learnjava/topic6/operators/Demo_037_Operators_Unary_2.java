/*
 * pre increment and post increment operator
 */

package com.learnjava.topic6.operators;

public class Demo_037_Operators_Unary_2 {

	public static void main(String[] args) {

		int number =0;
		int number1 =++number;
		System.out.println("pre increament value "+number1);
		
		
		System.out.println("----------------------------");
		
		int num =0;
		int num1 =num++;
		System.out.println("post increament value "+num1);
		
		System.out.println("Number value "+num);
		
		System.out.println("----------------------------");
		
		int a =1;
		System.out.println("value of is "+a);
		System.out.println("value of is "+ ++a);
		System.out.println("value of is "+a);
		
		System.out.println("----------------------------");
		
		int b =1;
		System.out.println("value of is "+b);
		System.out.println("value of is "+ b++);
		System.out.println("value of is "+b);
		


		}

}
