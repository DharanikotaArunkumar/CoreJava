package com.companyname.demo3.classandobjectautonomy;

/*
 * The method should return some value is all scenarios .
 */

public class Demo_ClassAndObject_12_Method {

	public static void main(String[] args) {

		boolean isDivisiableBy10 = isNumberDividedBy10(12);
		System.out.println(isDivisiableBy10);
		
		
		boolean isDivisiableBy2 = isNumberDividedBy2(6);
		System.out.println(isDivisiableBy2);
		
		

	}

	static boolean isNumberDividedBy10(int number) {

		if (number % 10 == 0) {
			return true;
		}
		return false;
	}
	
	
	static boolean isNumberDividedBy2(int number) {

		boolean flag = false;
		if (number % 2 == 0) {
			flag =true;
			
		}else{
			flag =false;
		}
		System.out.println("method ended");
		return flag;
	}
	
	
}
