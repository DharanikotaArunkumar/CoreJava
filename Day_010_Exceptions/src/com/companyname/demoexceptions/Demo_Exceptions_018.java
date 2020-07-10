package com.companyname.demoexceptions;

// if we want to execute the few statements in all cases then we will go for exception .
// try-catch-finally order should be correct , not like default in switch control 

public class Demo_Exceptions_018 {
	
	public static void main(String[] args) {
		String str = null;
	//	String str ="ABC";
		try {		
			System.out.println("Inside try block");
				str.toLowerCase();
			
		} catch (NullPointerException exp) {
			System.out.println("NullPointerException been raised :");
		}
		finally{
			System.out.println(" Please write here some code in all the cases ");
		}

	}

}
