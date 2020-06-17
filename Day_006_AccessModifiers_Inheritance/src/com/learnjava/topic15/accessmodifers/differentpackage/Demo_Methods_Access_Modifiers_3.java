package com.learnjava.topic15.accessmodifers.differentpackage;


import com.learnjava.topic15.accessmodifiers.samepackage.Demo_Methods_Access_Modifiers_1;

public class Demo_Methods_Access_Modifiers_3 {

	public static void main(String[] args) {
		Demo_Methods_Access_Modifiers_1 obj =new  Demo_Methods_Access_Modifiers_1();
		obj.publicMethod();
	/*	obj.defaultMethod();
		obj.protectedMethod();
		obj.privateMethod();*/

	}

}

