/*
 * Explicit type casting example
 */

package com.learnjava.topic5.typecasting.explicit;

public class Demo_029_ExplicitTypeCasting {

	public static void main(String[] args) {
		
								
				int intValue = 12;
				System.out.println("intValue is 	:"+intValue); 
								
				/*short shortValue = (short) intValue;
				System.out.println("shortValue is 	:"+shortValue); 
				*/
				byte byteValue=  (byte) intValue;
				System.out.println("ByteValue is  	:"+byteValue); 
								
				double doubleValue = 123.34d;
				System.out.println("doubleValue is  :"+doubleValue);
				
				float floatValue= (float) doubleValue;
				System.out.println("floatValue is  	:"+floatValue);
					
				
	}

}
