package com.companyname.demoexceptions;
// writing the sub class exceptions is better than handing the super class exception .
// for specific exception specific text can be displayed or specific business impl will be done .

public class Demo_Exceptions_014 {

	public static void main(String[] args) {
		String str= null;
		int[] array = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Values Of array " + array[i]);
				str.toLowerCase();
					}
		} 
		catch (ArrayIndexOutOfBoundsException exp) { 
			System.out.println("ArrayIndexOutOfBoundsException been raised :");
			exp.printStackTrace();
			
		}
		
		catch (NullPointerException exp) { 
			System.out.println("NullPointerException been raised :");
			exp.printStackTrace();
			
		}
		
		catch (Exception exp) { 
			System.out.println("NullPointerException been raised :");
			exp.printStackTrace();
			
		}


	}

}
