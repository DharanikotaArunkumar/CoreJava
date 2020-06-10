/*
 * Problem :- cannot convert from int to byte/short , even both variables are byte .
 * 
 * Cause :- addition of any data type will result as int data type
 * 
 * Solution :- assign to int variable, Make sure you always assign any addition to int type in your project .
 *			if in case if you want to add to byte variable only then type cast in to byte
 */

package com.learnjava.topic4.datatypes.selfstudy;

public class Demo_026_DataTypes_RealTime {

	public static void main(String[] args) {

		//byte byteValue1 = 100;
		//byte byteValue2 = 28;

		/*
		 * byte totalValue = (byteValue1 + byteValue2);
		 * System.out.println(totalValue);
		 */

		/*
		 * byte totalValue = (byte)(byteValue1 + byteValue2);
		 * System.out.println(totalValue);
		 */
	}

}
