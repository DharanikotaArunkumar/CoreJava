package com.companyname.demo3.classandobjectautonomy;

/*
 * 	Static methods will be at class level .
 */

class Employee{
	
	static int count;
	
	Employee(){
		count++;
	}
	
	public static  void getCount(){
		System.out.println(" no of objects at present :- "+count);
	}
	
	public void display(){
		System.out.println(" no of objects at present :- "+count);
	}
	
	
		
}


public class Demo_ClassAndObject_010_StaticMethod {

	public static void main(String[] args) {
	
		
		Employee.getCount();
		Employee employee = new Employee();
		employee.getCount();
		
		
		

	}

}
