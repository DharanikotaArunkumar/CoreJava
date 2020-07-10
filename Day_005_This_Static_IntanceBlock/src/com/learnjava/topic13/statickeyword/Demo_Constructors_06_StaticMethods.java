package com.companyname.demo5.staticdemo;

/*
 * 	Static methods will be at class level .
 */

class Employee{
	
	static int count;
	
	Employee(){
		count++;
	}
	
	public static   void getCount(){
		System.out.println(" no of objects at present :- "+count);
	}
	
		
}


public class Demo_Constructors_06_StaticMethods {

	public static void main(String[] args) {
	
		
		Employee.getCount();
		/*Employee employee = new Employee();
		employee.getCount();
		*/
		
		

	}

}
