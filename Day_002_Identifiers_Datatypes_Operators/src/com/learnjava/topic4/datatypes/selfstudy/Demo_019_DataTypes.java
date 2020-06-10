/*
 * Range check for byte 
 */
package com.learnjava.topic4.datatypes.selfstudy;

public class Demo_019_DataTypes {

	public static void main(String[] args) {

		
		
		/*
		 * size :- 1 Byte/ 8 bits 
		 * min value =-128 max value =+127 
		 * range =-128 to +127
		 */

		byte count = 99;
		System.out.println(count);

		/*
		 * Min Value check
		 */

		byte byteMinValue = -128;
		System.out.println(byteMinValue);

		/*
		 * Max Value check
		 */

		byte byteMaxValue = 127;
		System.out.println(byteMaxValue);

		/*
		 * Range Check Maximum
		 */
		//-128 -127 -126 -125 -124 ....0 ..........125 126 127 // 128 129 130
		
		 byte rangeMax = (byte) 1000;
		 System.out.println(rangeMax);

		
		/* Range Check Minimum
		 

		 byte rangeMin = -129;
		 System.out.println(rangeMin);

		byte charTest= "hi"; // we can not assign string to byte
		System.out.println(charTest);*/
		 
	
		//byte oneChar ='a'; //65 
		
			/* byte f= true;
		 System.out.println(f);*/

	}

}
