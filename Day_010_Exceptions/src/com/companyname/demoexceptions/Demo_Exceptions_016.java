package com.companyname.demoexceptions;

// we should not have any checked exceptions with out raising statements .
public class Demo_Exceptions_016 {

	public static void main(String[] args) {
String parameter ="Demo_Exceptions_55";
		
		
		
				try {
					try {
						Class.forName(parameter).newInstance();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		

	}

}
