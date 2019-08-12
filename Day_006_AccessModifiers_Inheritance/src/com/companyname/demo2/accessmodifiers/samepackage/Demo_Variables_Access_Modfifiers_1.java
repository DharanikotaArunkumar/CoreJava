package com.companyname.demo2.accessmodifiers.samepackage;

//Within Same Class	

public class Demo_Variables_Access_Modfifiers_1 {
	
	  public String publicVariable="public";
	  String defaultVariable="default";
	  protected String protectedVariable="protected";
	  private String privateVariable="private";

	public static void main(String[] args) {
		Demo_Variables_Access_Modfifiers_1 obj =new Demo_Variables_Access_Modfifiers_1();
		
		System.out.println("The value of  publicVariable :-"+obj.publicVariable);
		System.out.println("The value of  defaultVariable :-"+obj.defaultVariable);
		System.out.println("The value of  protectedVariable :-"+obj.protectedVariable);
		System.out.println("The value of  privateVariable :-"+obj.privateVariable);

	}

}
