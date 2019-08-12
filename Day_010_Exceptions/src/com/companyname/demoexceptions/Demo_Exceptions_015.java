package com.companyname.demoexceptions;

// Checked exception and unchecked exception 
// Checked exception are the exception identified the compiler , java people made most of the common 
// errors under checked exceptions to avoid problems . 

public class Demo_Exceptions_015 {

	public static void main(String[] args) {
		
		String parameter ="Demo_Exceptions_005";
		
		
		
		
			try {
				Class.forName(parameter);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		String str =null;
		System.out.println(str.toLowerCase());
		
			
		

	}

}
