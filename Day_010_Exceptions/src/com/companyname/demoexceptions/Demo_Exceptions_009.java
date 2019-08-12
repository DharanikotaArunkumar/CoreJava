package com.companyname.demoexceptions;

// once the control goes to the catch block control never returns to the try block .

public class Demo_Exceptions_009 {

	public static void main(String[] args) {
		System.out.println("Program Started ");
		int[] array = new int[5];

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Values Of array " + array[i]);
				System.out.println("I Am printed for the value "+i);// for i=5 this will not be printed 
			// Better to keep only exception suspected statements in the try .
			}
		} catch (ArrayIndexOutOfBoundsException exp) { 
			System.out.println("Excepyion been raised :");
			exp.printStackTrace();
			
		}
		
		
	}

}
