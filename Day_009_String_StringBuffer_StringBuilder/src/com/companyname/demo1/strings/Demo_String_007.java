package com.companyname.demo1.strings;


//When ever we create any object to the class that object will be stored in the heap . Each and every object separte memory will be created 


class Person{

	
	String name;
	Person(String str){
		name =str;
	}
	
	
}

public class Demo_String_007 {

	public static void main(String[] args) {
		Person p1 =new Person("jay");
		Person p2 =new Person("jay");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		

	}

}
