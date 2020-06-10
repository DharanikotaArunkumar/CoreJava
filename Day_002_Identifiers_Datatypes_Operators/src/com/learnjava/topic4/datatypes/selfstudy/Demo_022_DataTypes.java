/*
 * Range check for long 
 */
package com.learnjava.topic4.datatypes.selfstudy;

public class Demo_022_DataTypes {

	public static void main(String[] args) {
		/* long
		 * size :- 8 Byte 
		 * min value =-9,223,372,036,854,775,808  max value =+9,223,372,036,854,775,807  
		 * range =-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
		 */

		long count = 100000000000L; // long should be followed by the 'l' or 'L'
		System.out.println(count);
		
		/*
		 * Min Value check
		 */

		long minValue = -9223372036854775808L;
		System.out.println(minValue);

		/*
		 * Max Value check
		 */

		long maxValue = 9223372036854775807L;
		System.out.println(maxValue);

		/*
		 * Range Check Maximum
		 */
		
		
		/* long rangeMax = 9223372036854775808L;
		 System.out.println(rangeMax);
		 //long value is out of range
*/		 		
		
		/*
		 * Range Check Minimum
		 */

		 /*long rangeMin = -9223372036854775809L;
		 System.out.println(rangeMin);
		 //The literal 2147483649 of type long is out of range 
		  */
		
		/*long name= "Joe";
		System.out.println(name);
		 */
		
		 /*long isValid= true;
		System.out.println(isValid);*/

	}

}
