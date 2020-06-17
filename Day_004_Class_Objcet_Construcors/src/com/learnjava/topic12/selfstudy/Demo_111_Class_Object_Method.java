package com.learnjava.topic12.selfstudy;
/*
 * Method arguments act as the local variables to that method . 
 */

class Calculator {

	float calculateAverage(int number1, int number2, int number3) {
		float value = (number1 + number2 + number3) / 3;
		return value;
	}

}

public class Demo_111_Class_Object_Method {

	public static void main(String[] args) {

		float avgValue = new Calculator().calculateAverage(1, 2, 3);
		System.out.println("AverageValue of 3 numbers is :- " + avgValue);

	}

}
