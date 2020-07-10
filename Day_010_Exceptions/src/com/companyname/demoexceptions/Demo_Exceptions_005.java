package com.companyname.demoexceptions;
/*Checked Exceptions :-

If compiler identifies the exception then those types of exceptions are called Checked Exceptions .Because those
been checked by the compilers .*/

public class Demo_Exceptions_005 {

	public static void main(String[] args) {
		
		//class forname is used to create instance of the class on runtime when we are not aware on the
		//object to be created 
		
		String parameter ="Demo_Exceptions_5";
		try {
			Object newInstance = Class.forName(parameter).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

 }

}
