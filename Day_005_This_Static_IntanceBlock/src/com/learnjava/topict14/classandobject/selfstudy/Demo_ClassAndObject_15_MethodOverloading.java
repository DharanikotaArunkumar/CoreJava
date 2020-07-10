package com.companyname.demo3.classandobjectautonomy;

/*
 * One and only rule for the method overloading is method name is same and argument list is changed .
 */
public class Demo_ClassAndObject_15_MethodOverloading {

	public static void main(String[] args) {
		
		byte value1 =12;
		int value2 =15;
		
		calculateAverage(value1, value2); //byte , int
										// short , int
										// int , int
										// long , int

		float avgValue2 = calculateAverage(1, 2);// int , int 
		System.out.println("AverageValue of 2 numbers is :- " + avgValue2);

		int avgValue3 = calculateAverage(1, 2, 3);
		System.out.println("AverageValue of 3 numbers is :- " + avgValue3);

		calculateAverage(1, 2, 3, 8);
	
	}



	static int calculateAverage(int number1, int number2, int number3) {
		System.out.println("normal");
		int value = (number1 + number2 + number3) / 3;
		return value;
	}
	
	static float calculateAverage(long number1, int number2) {
		float value = (number1 + number2) / 2;
		return value;
	}

	static void calculateAverage(int number1, int number2, int number3, int number4) {
		float value = (number1 + number2 + number3 + number4) / 4;
		System.out.println("AverageValue of 4 numbers is :- " + value);
		return ;
	}

}
