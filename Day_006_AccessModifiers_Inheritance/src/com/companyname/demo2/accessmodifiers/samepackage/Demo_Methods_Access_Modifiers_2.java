package com.companyname.demo2.accessmodifiers.samepackage;
//Any Class in Same Package	

public class Demo_Methods_Access_Modifiers_2 {

	public static void main(String[] args) {
		Demo_Methods_Access_Modifiers_1 obj =new  Demo_Methods_Access_Modifiers_1();
		obj.publicMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		//obj.privateMethod();

	}

}
