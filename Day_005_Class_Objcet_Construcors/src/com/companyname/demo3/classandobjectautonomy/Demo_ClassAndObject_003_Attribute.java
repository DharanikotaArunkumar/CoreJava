package com.companyname.demo3.classandobjectautonomy;
/*
 * We can have the same name for the attributes and local variables . 
 * Always it takes the local variable as priority .
*/
public class Demo_ClassAndObject_003_Attribute {
	
	
	
			// Scope of this attribute is total class 
				public static  int noOfBooks;
				
		public static void main(String[] args) {
			
			// Scope of this  Local Variable is in side this method 
			int noOfBooks =1232 ;
			System.out.println(" The noOfBooks is called as local variable  and its value is "+noOfBooks);
			
		}

}
