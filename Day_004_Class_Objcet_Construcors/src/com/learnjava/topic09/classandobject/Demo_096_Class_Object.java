package com.learnjava.topic09.classandobject;

class Person {

	String name;
	float height;
	float weight;
	
	
	void information() {
		System.out.println("Person Information:- " + name + "  " + height + "  " + weight);
	}

}


public class Demo_096_Class_Object {

	public static void main(String[] args) {

			System.out.println("Before creating Object\n\n ");
			
			Person person1 = new Person();
			
			System.out.println("\n\nafter creating the object ");
			/*person1.name ="John";
			person1.height =173;
			person1.weight =65;*/
			person1.information();
			
	}

}
