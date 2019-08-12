package com.companyname.demo5.unary;

public class Demo_Unary_2 {

	public static void main(String[] args) {
		
		int x= 0;
		x= x+1;
		System.out.println(" value of x is :"+x);		
		
		++x; //x =x+1
		
		int y =0;
		++y;
		System.out.println(" Value of y is :"+y);
		
		int z=0;
		z++;
		System.out.println("value of z is :"+z);
		
		System.out.println("----------------------------");
		
		int number =0;
		int number1 =++number;
		System.out.println("pre increament value "+number1);
		
		
		System.out.println("----------------------------");
		
		int num =0;
		int num1 =num++;
		System.out.println("post increament value "+num1);
		
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
