package com.learnjava.topic4.datatypes;

public class Demo_015_DataTypes_007 {

	public static void main(String[] args) {
		/* double
		 * size :- 8 Byte 
		 * Range :- 4.9E-324d to  1.7976931348623157E308
		 */

		
		double value =3.14d;
		System.out.println(value);
		
	double weightInMilliGrames = 34.45d;
	System.out.println(weightInMilliGrames);
	
	double maxValue=1.7976931348623157E308d;
	
	System.out.println(maxValue);
	
	double minvalue =4.9E-324d;
	System.out.println(minvalue);
	
	
	/*double maxValueCheck=1.7976931348623157E309d;	
	System.out.println(maxValueCheck);
	*/
	/*double minvalueCheck =4.9E-325d;
	System.out.println(minvalueCheck);
	*/
	// By default all floating point variables in Double it is optional to keep d/D .but advised .
	double lengthInMM =23.345;
	System.out.println(lengthInMM);	
	
	double currencyIncents = 92;
	System.out.println(currencyIncents);


	}

}
