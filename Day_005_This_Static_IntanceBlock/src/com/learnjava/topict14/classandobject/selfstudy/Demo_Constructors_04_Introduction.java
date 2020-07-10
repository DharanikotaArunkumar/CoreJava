package com.companyname.demo1.constructors;
/*
 * Which constructor will be called and one of the reason why java is object oriented programming language .
 */

import com.learnjava.topic09.classandobject.Fruits;

class Fruits{
	
	Fruits(){
		System.out.println(" fruits constructor been called ");
	}
	
	void test(){
		System.out.println("fruits test method called");
	}
	
}

class Veggis{
	
	
	void test(){
		System.out.println("veggis test method is called");
	}
	
}

public class Demo_Constructors_04_Introduction {
	
	Demo_Constructors_04_Introduction(){
		System.out.println(" Demo_Constructors_04_Introduction been called ");
	}
	
	void test(){
		System.out.println("Demo_Constructors_04_Introduction test method called ");
	}

	public static void main(String[] args) {
		Fruits fruits = new Fruits(); // does compiler will give constructor ? which constructor will be called . 
		Veggis veggis = new Veggis(); // does compiler will give constructor ? which constructor will be called .
		Demo_Constructors_04_Introduction object1 = new Demo_Constructors_04_Introduction();// does compiler will give constructor ? which constructor will be called .
		fruits.test();//which test method will be called .
		veggis.test();//which test method will be called .
		object1.test();//which test method will be called .
		
		/*Impotent point :- Here we are controlling the flow of the program by using objects .Because one of this reason 
		Java is known for  as object oriented programming language .
		*/
		

	}

}
