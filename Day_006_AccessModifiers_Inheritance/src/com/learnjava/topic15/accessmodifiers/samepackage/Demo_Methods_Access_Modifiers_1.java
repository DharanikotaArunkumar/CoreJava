package com.learnjava.topic15.accessmodifiers.samepackage;

//Access modifiers for methods Within Same Class		

public class Demo_Methods_Access_Modifiers_1 {
	
	public  void publicMethod(){
		System.out.println("i am Public method");
	}
	
	
	protected  void protectedMethod(){
		System.out.println("i am protected method");
	}
	
	
	 void defaultMethod(){
		System.out.println("i am default scoped method");
	}
	
	private  void privateMethod(){
		System.out.println("i am private method");
	}

	public static void main(String[] args) {
		
		Demo_Methods_Access_Modifiers_1 obj =new  Demo_Methods_Access_Modifiers_1();
		obj.publicMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.privateMethod();
	}

}
