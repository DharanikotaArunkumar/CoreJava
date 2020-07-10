package com.learnjava.topic14.instanceblock;

class Person {

	private String name;
	private float weight;

	private  static int counter;

	static {
		++counter;
		System.out.println(" Block------No of persons born today till now " + counter);

	}

	static void display1(){
		System.out.println(" Static Method " + counter);

	}
	Person() {
		System.out.println("I am from no -arg");
	}

	Person(String name) {
		this.name = name;
		System.out.println("I am from 1 -arg");

	}

	Person(String name, float weight) {
		this.name = name;
		this.weight = weight;
		System.out.println("I am from 2 -arg");

	}

	void displayStats() {
		System.out.println("No of persons born today till now " + counter);
		System.out.println(name);

		display1(); // 1 st way
	}

}

public class Demo_ClassAndObject_001_instanceBlock {

	public static void main(String[] args) {

			try {
				Class.forName("com.companyname.demo3.instanceblock.Person");
				Person.display1(); // 2nd way
			
			} catch (ClassNotFoundException exp) {
				// TODO Auto-generated catch block
				exp.printStackTrace();
			}
			
			
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person("Vijay");
		Person person4 = new Person("Ajay");
		Person person5 = new Person("Raja", 3.5f);
		Person person6 = new Person("Ravi", 2.5f);
		person1.display1(); // 3rd way
		
		new Demo_ClassAndObject_001_instanceBlock().main1();

	} 
	
	public  void main1() {

		Person.display1(); // 3rd way

} 

}
