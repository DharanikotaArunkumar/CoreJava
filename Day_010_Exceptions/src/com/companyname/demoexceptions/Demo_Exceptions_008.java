package com.companyname.demoexceptions;

/* A single catch will not handle all exceptions , A catch with corresponding matching exception class
then the exception will be handled .*/

public class Demo_Exceptions_008 {

	public static void main(String[] args) {
		System.out.println("Program Started ");
		int[] array = new int[5];

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Values Of array " + array[i]);// Exception raise statement
			}
		} catch (NullPointerException exp) { 
			System.out.println("Excepyion been raised :");
		}
		
		System.out.println(" will i be printed ..? ");
	}

}
