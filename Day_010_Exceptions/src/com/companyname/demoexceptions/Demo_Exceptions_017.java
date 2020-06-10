package com.companyname.demoexceptions;

// We should give the fully qualified name to the for class 
public class Demo_Exceptions_017 {

	public static void main(String[] args) {
		try {
			String parameter ="Demo_Exceptions_5";
			Class.forName(parameter).newInstance();
			//Class.forName("com.companyname.demoexceptions.Demo_Exceptions_005").newInstance();
			System.out.println(" i am called ");
			
		} catch (InstantiationException e) {// will be raised while creating the object to abstract class
			
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
