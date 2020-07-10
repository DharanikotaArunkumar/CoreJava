package com.companyname.demo3.classandobjectautonomy;

// We should not have any statement after return .Return Statement should be the last executable statement in the method .

public class Demo_ClassAndObject_11_Method {

	public static void main(String[] args) {
		
		float avgValue =calculateAverage(1,2,3);
		System.out.println("AverageValue of 3 numbers is :- "+avgValue);

	}

	
	static float calculateAverage(int number1,int number2,int number3)  
	{
		float value = (number1+number2+number3)/3; 
		return value;
		
		//System.out.println("Method Returned Value "+value);
	}
}
