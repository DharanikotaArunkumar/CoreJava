package com.companyname.demo4.constructorscontinues;
/*
 *  Can we have the method name as the class name .
 *  You know :- Its not the standard convention to give the method name as the constructor.
 */

class Person{
	
	Person(){
		
		System.out.println(" I am constrctor , Because i hold the same name as class name and no return type ");
	}
	
	void Person(){
		System.out.println(" I am a method with same name, I am not the Constructor ");
	}
	
}

public class Demo_Constructors_02_Constructos {
	
	public static void main(String[] args) {
	
	
		Person person1 = new Person();// Here Person constructor will be called 
		person1.Person(); // We know that we can not call constructor explicitly , But here i am calling the person method ,Not constructor 
		
	}

}
