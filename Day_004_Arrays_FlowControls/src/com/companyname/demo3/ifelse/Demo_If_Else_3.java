package com.companyname.demo3.ifelse;

public class Demo_If_Else_3 {

	public static void main(String[] args) {
		
		//Project Tip :- Always follow the {} ,even it contains single line.
		
		String name ="hello";
		
		
		if (name instanceof String)
			System.out.println("String Class instance ");
		else
			System.out.println("I not a String instance");
			System.out.println("end of else");
			
			
			if (name instanceof String){
				System.out.println("String Class instance ");
			}
			else{
				System.out.println("I not a String instance");
				System.out.println("end of else");	
			}
			
		
	

	}

}
