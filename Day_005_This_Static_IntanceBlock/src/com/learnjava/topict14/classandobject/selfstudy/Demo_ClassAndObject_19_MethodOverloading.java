package com.companyname.demo3.classandobjectautonomy;

/*
 * The method getMaxNumber is ambiguous . Here both methods will match .
 */
public class Demo_ClassAndObject_19_MethodOverloading {

	public static void main(String[] args) {
/*		double maxValue = getMaxNumber(2,2);
		System.out.println(maxValue);*/
	
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
	
	static double getMaxNumber(double number1 ,int number2){
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
