package com.companyname.demo2.accessmodifiers.samepackage;
//Any Class in Same Package	





public class Demo_Variables_Access_Modifiers_2 {

	public static void main(String[] args) {
		Demo_Variables_Access_Modfifiers_1 obj1 =new Demo_Variables_Access_Modfifiers_1();
		
		System.out.println("The value of  publicVariable :-"+obj1.publicVariable);
		System.out.println("The value of  defaultVariable :-"+obj1.defaultVariable);
		System.out.println("The value of  protectedVariable :-"+obj1.protectedVariable);
		//System.out.println("The value of  privateVariable :-"+obj1.privateVariable);


	}

}
