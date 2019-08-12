package com.companyname.demo1.constructors;
/*
 * How can we create user defined constructor  .
 * 		1) Constructor name should be same as the class name .
 *	    2) Constructor does not have any return type even void also .
 *
 */
class Person {

	String name;
	float height;
	float weight;
	
	Person(){
	System.out.println("Constructor called .");	
	}
	
	void information() {
		System.out.println("Person Information:- " + name + "  " + height + "  " + weight);
	}

}


public class Demo_Constructors_02_Introduction {

	public static void main(String[] args) {

			System.out.println("Before creating Object\n\n ");
			
			Person person1 = new Person();
			
			// new is a operator to create the object in memory  in the heap .
			/*
			Step 1 :- A object will be created in the heap 
			Step 2 :- i will load all the variables in the heap 
			Step 3 :- default values will be assigned 
			Step 4 :- references to the methods will be created and stores in the method area . 
			Step 5 :- Temporary reference will be created to the object and returned to program . 
			Step 6 :- We are assigning that reference to object name (person1) . 
			
			
			Now , 
			
				Code inside constructor will be called .
			*/
			
			System.out.println("\n\nafter creating the object ");
			/*person1.name ="John";
			person1.height =173;
			person1.weight =65;*/
			person1.information();
			
	}

}
