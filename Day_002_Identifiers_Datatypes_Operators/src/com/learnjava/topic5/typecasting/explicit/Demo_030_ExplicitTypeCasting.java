package com.learnjava.topic5.typecasting.explicit;

public class Demo_030_ExplicitTypeCasting {

	public static void main(String[] args) {

		int intValue = 65;

		System.out.println("intValue is " + intValue);

		char character = (char) intValue;

		System.out.println("character value is " + character);
		
		boolean booleanValue = true;
		
		System.out.println("booleanValue value is " + booleanValue);
		
			/*boolean will not be converted to any other data type . because its allowed values are true ,false and those are not allowed in
			other data types 
			*/
			
			/*
			byte byteValue =(byte) booleanValue;
			short shortValue =booleanValue;
			int intValue =booleanValue;
			long longValue =booleanValue;
			float floatValue =booleanValue;
			double doubleValue =booleanValue;
			char charValue= booleanValue;
			*/
	}

}
