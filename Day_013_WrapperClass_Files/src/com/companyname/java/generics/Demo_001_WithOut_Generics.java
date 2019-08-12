/*
 * What is the problem in generic 
 */
package com.companyname.java.generics;

public class Demo_001_WithOut_Generics {

	public static void main(String[] args) {
		
		Store store = new Store(); 
		store.setBook(new Book(100, 20)); // Here in store , the type book is hard coded . 
		

	}

}
