package com.companyname.demo3.classandobjectautonomy;

public class Demo_ClassAndObject_18_MethodOverloading {

	public static void main(String[] args) {
		double maxValue = getMaxNumber(2,2.0);
		System.out.println(maxValue);
	}

	static double getMaxNumber(int number1 ,double number2){
		double maxValue;
		if(number1<number2){
			maxValue =number2;
			return maxValue;
		}
		else{
			maxValue =number2;
			return maxValue;
		}
	}
	
	static double getMaxNumber(long number1 ,float number2){
		double maxValue;
		if(number1<number2){
			maxValue =number2;
			return maxValue;
		}
		else{
			maxValue =number2;
			return maxValue;
		}
	}
}
