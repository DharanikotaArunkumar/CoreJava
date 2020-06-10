/*
 * implicit type casting example
 */
package com.learnjava.topic5.typecasting.implicit;

public class Demo_031_ImplicitTypeCasting {

	public static void main(String[] args) {
		
		
		
		
		// Integral type conversation 
		byte byteValue= 120;
		
		System.out.println("ByteValue is  	:"+byteValue);
		
		short shortValue = byteValue;
		
		System.out.println("shortValue is 	:"+shortValue);
		
		int intValue =  shortValue;
		
		System.out.println("intValue is 	:"+intValue);
		
		long longValue =intValue;
		
		System.out.println("longValue is 	:"+longValue);
		
		
		float floatValue= longValue;
		
		System.out.println("floatValue is   :"+floatValue);
		
		
		double doubleValue = floatValue;
		
		System.out.println("doubleValue is   :"+doubleValue);		
		
		
	}

}
