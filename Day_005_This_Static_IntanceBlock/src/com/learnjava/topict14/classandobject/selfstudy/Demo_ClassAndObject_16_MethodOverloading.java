package com.companyname.demo3.classandobjectautonomy;

/*
 * All integers by default will be call int value and all fraction number will call double by default .
 * if exact match not found then it will widen .
 * 
 * byte --> short --> int --> long --> float --> double 
 * 
 * 
 */
public class Demo_ClassAndObject_16_MethodOverloading {

	public static void main(String[] args) {
		
		double value = getSquareValue(2); //int --> long
		System.out.println(" SquareValue  is "+value);
		
		double value1 = getSquareValue(2l); // long
		System.out.println(" SquareValue  is "+value1);
		
		double value2 = getCubeValue(2.0f); //float --> double
		System.out.println(" cubeValue  is "+value2);
		

		double value3 = getCubeValue(2.0);
		System.out.println(" cubeValue  is "+value3);

	}
	
	
	static double getSquareValue(int value){
		System.out.println("Called from getSquareValue -int");
		return value*value;
	}
	
	static double getSquareValue(long value){
		System.out.println("Called from getSquareValue -long");
		return value*value;
	}
	
	
	static double getCubeValue(float value){
		System.out.println("Called from getCubeValue - float");
		return value*value*value;
	}
	static double getCubeValue(double value){
		System.out.println("Called from getCubeValue - double");
		
		return value*value*value;
	}

}
