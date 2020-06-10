/*
 * implicit type casting
 */
package com.learnjava.topic5.typecasting.implicit;

public class Demo_032_ImplicitTypeCasting {

	public static void main(String[] args) {
		
		// character to int conversion 
		
		char character = 'A';
		
		System.out.println("Character is "+character);
		
		
		// Here character value is converted to integer and value of that character is same as the uni code value of the character  
		int intValue =character;
		
		System.out.println("int value is  :"+intValue);
		
		
		boolean booleanValue = true;
		
		System.out.println("booleanValue is  :"+booleanValue);
		
		/*boolean will not be converted to any other datatype . because its allowed values are true ,false and those are not allowed in
		other data types 
		*/
		
		
		
		
		/*byte byteValue =booleanValue;
		short shortValue =booleanValue;
		int intValue =booleanValue;
		long longValue =booleanValue;
		float floatValue =booleanValue;
		double doubleValue =booleanValue;
		char charValue= booleanValue;*/
		
		 

	}

}
