package com.companyname.demo3.classandobjectautonomy;
/*
 * First Best match else Next match 
 * 
 * byte --> short --> int --> long --> float --> double 
 */

public class Demo_ClassAndObject_17_MethodOverloading {

	public static void main(String[] args) {
	byte inputValue = 2;
		//short inputValue = 2;
		//int inputValue = 2;
		//long inputValue = 2;
		//float inputValue = 2;
		//double inputValue = 2;
		// give direct value 2 , 2.0 2.0f, 2.0d ,2L

		double value = getSquareValue(inputValue);
		System.out.println(" SquareValue  is "+value);

	}
	
	/*static double getSquareValue(byte value){
		System.out.println("Called from getSquareValue -Byte");
		return value*value;
	}
	*/
	static double getSquareValue(short value){
		System.out.println("Called from getSquareValue -Short");
		return value*value;
	}
	static double getSquareValue(int value){
		System.out.println("Called from getSquareValue -int");
		return value*value;
	}
	
	static double getSquareValue(long value){
		System.out.println("Called from getSquareValue -long");
		return value*value;
	}
	
	static double getSquareValue(float value){
		System.out.println("Called from getSquareValue - float");
		return value*value;
	}
	
	static double getSquareValue(double value){
		System.out.println("Called from getSquareValue - double");
		return value*value;
	}

}
