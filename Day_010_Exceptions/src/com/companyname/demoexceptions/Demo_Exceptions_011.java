package com.companyname.demoexceptions;

// we can have multiple catch blocks for single try block .

public class Demo_Exceptions_011 {

	public static void main(String[] args) {
		String str= null;
		int[] array = new int[5];
		try {
		
					
				System.out.println("Values Of array " + array[4]);
				str.toLowerCase();
					
		} 
		catch (ArrayIndexOutOfBoundsException exp) { 
			System.out.println("ArrayIndexOutOfBoundsException been raised :");
			exp.printStackTrace();
			
		}
		
		catch (NullPointerException exp) { 
			System.out.println("NullPointerException been raised :");
			exp.printStackTrace();
			
		}

	}

}
