package com.companyname.demoexceptions;


// There should not be any statement in between the try catch 
public class Demo_Exceptions_010 {

	public static void main(String[] args) {
		int[] array = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Values Of array " + array[i]);
					}
		} 
		//System.out.println("am i allowed here");
		catch (ArrayIndexOutOfBoundsException exp) { 
			System.out.println("Excepyion been raised :");
			exp.printStackTrace();
			
		}
	}

}
