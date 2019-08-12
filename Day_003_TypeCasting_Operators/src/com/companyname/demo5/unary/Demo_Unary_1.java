package com.companyname.demo5.unary;

public class Demo_Unary_1 {

	public static void main(String[] args) {
		
		// unary operators works on only operand only ,we have 3 unary operators 
		
		//1) unary minus (-)
		//2) increment (++)
		//3) decrement (--)
		//4) unary plus (+) indicates the positive 
		
		int stockPriceChange =250;
		System.out.println("stock price  change today "+(-stockPriceChange));
		
		int number =120;
		System.out.println("number value :  "+(-(-(number))));
		

	}

}
