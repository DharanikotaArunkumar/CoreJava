package com.companyname.demo3.assignment;

public class Demo_Assignment_1 {

	public static void main(String[] args) {
		
		// assignment  operator is used to store the value into a variable .
		// 1) assigning value directly to variable .
		
		int x=250;
		System.out.println("value of x is "+x); 
		
		// 2) assigning variable to another variable .
		
		int y=5000;
		x=y;
		System.out.println("value of x is "+x);
		
		//3) assigning expression to variable .
		
		x= 100;
		y=100;
		
		
		// noOfpages += additionalNewPage;
		x=x+y;
		System.out.println("value of x is "+x);
		
		//short hand notation of assignment   variable (operator)=variable;
		x= 100;
		y=100;
		
		
		x =x+y;
		
	//	x *=y;// x = x*y
	//	System.out.println("value of x is in short hand notation of (x=x*y) "+x);
		x +=y; // x= x+y;
		System.out.println("value of x is in short hand notation of (x=x+y) "+x);
		x -=y; // x=x-y;
		System.out.println("value of x is in short hand notation of (x=x-y) "+x);
		x /=y;// x=x/y
		System.out.println("value of x is in short hand notation of (x=x/y) "+x);
		x %=y; //x =x%y;
		System.out.println("value of x is in short hand notation of (x=x%y) "+x);
		
		
		
	}

}
