
/*
 * Arrays size can not be a -ve size .
 */
package com.learnjava.topic7.arrays.selfstudy;

public class Demo_057_Array {

	public static void main(String[] args) {
		int number[] = new int[5];
		int number1[] = new int[-5]; // we will get java.lang.NegativeArraySizeException
	}

}
