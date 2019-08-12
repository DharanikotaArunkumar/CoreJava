package com.companyname.demo2.array.importantPoints;

/*
 * Arrays size can not be a -ve size .
 */
public class Demo_Array_02 {

	public static void main(String[] args) {
		int number[] = new int[5];
		int number1[] = new int[-5]; // we will get java.lang.NegativeArraySizeException
	}

}
