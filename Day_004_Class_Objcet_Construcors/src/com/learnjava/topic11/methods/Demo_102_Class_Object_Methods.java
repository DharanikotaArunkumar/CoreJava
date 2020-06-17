package com.learnjava.topic11.methods;

/*
 *	Method Overloading is a feature that allows a class to have two or more methods having same name, 
 *  if their argument lists are different.
 */

class Calculate {

	float calculateAverage(int number1, int number2) {
		float value = (number1 + number2) / 2;
		return value;

	}

	float calculateAverage(int number1, int number2, int number3) {

		float value = (number1 + number2 + number3) / 3;
		return value;
	}

	float calculateAverage(int number1, int number2, int number3, int number4) {
		float value = (number1 + number2 + number3 + number4) / 4;
		return value;

	}
}

public class Demo_102_Class_Object_Methods {

	public static void main(String[] args) {

		float avgValue2 = new Calculate().calculateAverage(1, 2);
		System.out.println("AverageValue of 2 numbers is :- " + avgValue2);

		float avgValue3 = new Calculate().calculateAverage(1, 2, 3);
		System.out.println("AverageValue of 3 numbers is :- " + avgValue3);

		float avgValue4 = new Calculate().calculateAverage(1, 2, 3, 8);
		System.out.println("AverageValue of 4 numbers is :- " + avgValue4);

	}

}
