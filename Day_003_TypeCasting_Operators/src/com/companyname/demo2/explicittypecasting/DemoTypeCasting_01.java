package com.companyname.demo2.explicittypecasting;

public class DemoTypeCasting_01 {

	public static void main(String[] args) {
		//Explicit type casting example
								
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
//   +127 +126 +125 +124 +123+122 +121 +120 +119  ... 1 0 -1.......-115 -116 -117 -118 -119 -120 -121 -122 -123 -124 -125 -126 -127 -128