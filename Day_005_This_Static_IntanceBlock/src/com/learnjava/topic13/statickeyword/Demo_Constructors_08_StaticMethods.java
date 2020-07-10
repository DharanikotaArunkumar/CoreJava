package com.companyname.demo5.staticdemo;

/*
 * 	Static methods will be access the static data only  .
 */

class Employee2{
	
	static int count;
	String empName;
	
	Employee2(){
		count++;
	}
	
	// Static method 
	
	public static void getCount(){
		//System.out.println(empName);
		System.out.println(count);
	}
	
	// non static method
	
	public void empInformation(){
		System.out.println(empName);
		System.out.println(count);
	}
	
		
}


public class Demo_Constructors_08_StaticMethods {

	public static void main(String[] args) {
		
		Employee2.getCount();	
	
		/*Employee2 emp1 = new Employee2();
		emp1.empName ="john";
		emp1.empInformation(); // accessing by object reference 
*/			

	}

}
