/*
 * Child class specific overridden method can be called by using the super class reference  .
 */

package com.companyname.demo1.polymorphism;

class Employee {

	public void displyDesignation() {
		System.out.println(" I am An Employee");
	}
}

class CEO extends Employee {

	
	
	public void displyDesignation() {
		System.out.println(" I am CEO of company");
	}
}

class Manager extends Employee {

	public void displyDesignation() {
		System.out.println(" I am Manager of sales division");
	}
}

class SalesMen extends Employee {

	public void displyDesignation() {
		System.out.println(" I am SalesMen person");
	}
}

public class Demo_Polymorphism_03 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displyDesignation();
		
		emp = new CEO();
		emp.displyDesignation();
		
		emp = new Manager();
		emp.displyDesignation();
		
		emp = new Employee();
		emp.displyDesignation();
		
	}

}
