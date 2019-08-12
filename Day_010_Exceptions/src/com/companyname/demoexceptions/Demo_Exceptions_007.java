package com.companyname.demoexceptions;

/* Only when exception is raised and corresponding exception been handled then only catch block is excuted .
if there is no exception then catch block will not be executed .*/

public class Demo_Exceptions_007 {

	public static void main(String[] args) {
		System.out.println("Program Started ");
		int[] array = new int[5];

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Values Of array " + array[i]);// Exception raise statement
			}
		} catch (ArrayIndexOutOfBoundsException exp) { //exception handle 
			System.out.println("Excepyion been raised :");
		}
		
		System.out.println("Program Ended ");
	}

}
