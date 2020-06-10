/*
 * Range check for short 
 */
package com.learnjava.topic4.datatypes.selfstudy;

public class Demo_021_DataTypes {

	public static void main(String[] args) {
		/* int
		 * size :- 4 Byte 
		 * min value =-2,147,483,648  max value =+2,147,483,647   4 byte =32 ==> 2^32-1 to -2^32 
		 * range =-32,768 to +32,767
		 */

		int count = 1000000;
		System.out.println(count);

		/*
		 * Min Value check
		 */

		int minValue = -2147483648;
		System.out.println(minValue);

		/*
		 * Max Value check
		 */

		int maxValue = 2147483647;
		System.out.println(maxValue);

		/*
		 * Range Check Maximum
		 */
		
		
		/* int rangeMax = 2147483648;
		 System.out.println(rangeMax);*/
		 //int value is out of range
		 		
	
		
		
		/*
		 * Range Check Minimum
		 */
/*
		 int rangeMin = -2147483649;
		 System.out.println(rangeMin);
		 //The literal 2147483649 of type int is out of range 
*/		  
		
		/*int name= "Joe";
		System.out.println(name);
		 */
		
		 /*int isValid= true;
		System.out.println(isValid);*/

	}

}
