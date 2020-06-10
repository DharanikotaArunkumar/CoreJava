package com.learnjava.topic6.operators;

public class Demo_Unary_3 {

	public static void main(String[] args) {
		int x= 1;
		x= x-1;
		System.out.println(" value of x is :"+x);		
		
		int y =1;
		--y;
		System.out.println(" Value of y is :"+y);
		
		int z=1;
		z--;
		System.out.println("value of z is :"+z);
		
		System.out.println("----------------------------");
		
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
