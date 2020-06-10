/*
 * Range check for float 
 */

package com.learnjava.topic4.datatypes.selfstudy;

public class Demo_023_DataTypes {

	public static void main(String[] args) {
		/* float
		 * size :- 4 Byte 
		 * Range :- 3.4028235E38f to 1.4E-45f
		 */

		
		float value = 3.14f;
		System.out.println(value);
		
	float weightInMilliGrames = 34.45f;
	System.out.println(weightInMilliGrames);
	
	float maxValue=3.4028235E38f;
	
	System.out.println(maxValue);
	
	float minvalue =1.4E-45f;
	System.out.println(minvalue);
	
	
	/*float maxValueCheck=3.4028235E39f;	
	System.out.println(maxValueCheck);*/
	
	
	
	/*float minvalueCheck =1.4E-46f;
	System.out.println(minvalueCheck);*/
	
	// By default all floating point variables in Double .So we should define as f/F.
	//float lengthInMM =23.345;
	
	
	//float floatValue ="hi";
	
	float currencyIncents = 92;
	System.out.println(currencyIncents);

	}

}
