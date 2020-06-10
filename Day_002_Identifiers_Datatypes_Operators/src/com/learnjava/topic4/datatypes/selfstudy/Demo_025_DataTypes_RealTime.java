/*
 * Problem :- cannot convert from int to byte/short
 * 
 * Cause :- addition of any data type will result as int data type
 * 
 * Solution :- assign to int variable, Make sure you always assign any addition to int type in your project .
 */

package com.learnjava.topic4.datatypes.selfstudy;

public class Demo_025_DataTypes_RealTime {

	public static void main(String[] args) {
		byte byteValue=10;
		short shortValue=10;
		int intValue =10;
				
		//byte totalValue = byteValue+shortValue+intValue;
		//short totalValue =  (byteValue+shortValue+intValue);
		int totalValue = byteValue+shortValue+intValue;
		
		System.out.println(totalValue);
	}

}
