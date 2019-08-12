package com.companyname.java.generics;

public class Demo_003_Generics_intro {

	public static void main(String[] args) {
		Store2<String>  store = new Store2<String>();
		
		store.set("Effective Java");
		
		String bookValue = store.get(); // No conversion is needed .
		
		System.out.println("Book Name"+bookValue);
		
		//store.set(450.75); // Its throws compile time exception . With generic we will get type safety as advantage .
		
		Store2<Double> bookPrice = new Store2<Double>();
		bookPrice.set(450.75);
		bookPrice.set(120.45);
		
		Double bookRate = bookPrice.get();
		
		System.out.println("Book price "+bookRate);

	}

}
