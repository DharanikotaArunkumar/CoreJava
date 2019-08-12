package com.companyname.demo3.classandobjectautonomy;

/*
 * 	Static methods accessing types 
 */

class Employee1{
	
	static int count;
	String empName;
	
	Employee1(){
		count++;
	}
	
	// Static method 
	
	public static void getCount(){
		
		System.out.println("printing value from getCOunt method :- "+count);
	}
	
	// non static method
	
	public void empInformation(){
		
		getCount();// direct calling 
		System.out.println("printing value from empInformation method :- "+empName);
	
	}
	
		
}


public class Demo_ClassAndObject_011_StaticMethods {

	public static void main(String[] args) {
	
		Employee1 emp1 = new Employee1();
		emp1.empName = "john";
		emp1.empInformation();
		emp1.getCount(); // accessing by object reference 
		
		Employee1.getCount(); // accessing by using class name 
		emp1.empInformation();
		
		
		

	}

}
