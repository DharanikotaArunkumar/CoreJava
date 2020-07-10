package com.companyname.demoexceptions;
// All catch blocks should be in the proper (ascending order ) inheritance .
//A super class can handle the sub class exceptions 
/*	java.lang.Throwable
		java.lang.Exception
			java.lang.RuntimeException
				java.lang.IndexOutOfBoundsException
					java.lang.ArrayIndexOutOfBoundsException
				*/

public class Demo_Exceptions_013 {

	public static void main(String[] args) {
		
			int[] array = new int[5];
			try {
				
					System.out.println("Values Of array " + array[5]); // ArrayIndexOutOfBoundsException
						
			} 
			
			catch (Throwable exp) { 
				System.out.println("RuntimeException been raised :");
			
				}
			catch (RuntimeException exp) { 
				System.out.println("RuntimeException been raised :");
			
				}
			catch (ArrayIndexOutOfBoundsException exp) { 
				System.out.println("ArrayIndexOutOfBoundsException been raised :");
				
				}
			catch (IndexOutOfBoundsException exp) { 
				System.out.println("IndexOutOfBoundsException been raised :");
				
				}
			
			
			
			
	}


