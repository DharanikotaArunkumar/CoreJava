package com.learnjava.topic15.accessmodifers.differentpackage;

import com.learnjava.topic15.accessmodifiers.samepackage.Demo_Variables_Access_Modfifiers_1;

public class Demo_Variables_Access_modifiers_3 {

	public static void main(String[] args) {
		Demo_Variables_Access_Modfifiers_1 obj1 =new Demo_Variables_Access_Modfifiers_1();
		
		System.out.println("The value of  publicVariable :-"+obj1.publicVariable);
		System.out.println("The value of  defaultVariable :-"+obj1.defaultVariable);
		System.out.println("The value of  protectedVariable :-"+obj1.protectedVariable);
		System.out.println("The value of  privateVariable :-"+obj1.privateVariable);

	}

}
