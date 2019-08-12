package com.companyname.demoexceptions;

// We can have n number of try-catch blocks in the class and finally also can contains the try-catch block


public class Demo_Exceptions_020 {

	public static void main(String[] args) {
		String str = null;
		//String str ="ABC";
		
		try {		
			System.out.println("Inside try block");
				str.toLowerCase();
			
		} catch (NullPointerException exp) {
			System.out.println("NullPointerException been raised :");
		}
		
		
		
		
		try {		
			System.out.println("Inside try block");
				str.toLowerCase();
			
		} catch (NullPointerException exp) {
			System.out.println("NullPointerException been raised :");
		}
		finally{
			try{
				
			}
			catch(Exception e){
				
			}
			System.out.println(" Please write here some code in all the cases ");
		}

	}

}
