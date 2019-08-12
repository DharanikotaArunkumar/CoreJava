package com.companyname.demoexceptions;

public class Demo_Exceptions_006 {

	public static void main(String[] args) {
		System.out.println("Program Started ");

		int[] array =new int[5];
		
		
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Values Of array " + array[i]);// Exception raise statement
			}
		} catch (ArrayIndexOutOfBoundsException exp) { //exception handle 
			System.out.println("Excepyion been raised :");
		}
		
		System.out.println(" I am happy here i will be printed ");
	}

}
