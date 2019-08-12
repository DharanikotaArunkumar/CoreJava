package com.companyname.demo3.classandobjectautonomy;
/*
 * Method arguments act as the local variables to that method . 
 */

public class Demo_ClassAndObject_007_Method {

	public static void main(String[] args) {

		float avgValue =calculateAverage(1,2,3);
		System.out.println("AverageValue of 3 numbers is :- "+avgValue);
		
		

	}

	static float calculateAverage(int number1,int number2,int number3)  
	{
		//int number1; //Here number1 , number2  and numbe 3 are treated as local variables . 
		float value = (number1+number2+number3)/3; 
		return value;
		
	}
	

}
