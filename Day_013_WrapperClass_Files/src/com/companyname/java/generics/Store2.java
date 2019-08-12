package com.companyname.java.generics;

public class Store2<T> { // T means Type .
	
	private T value; // Cleaner code 
	
	void set(T t){
		value=t;
	}
	
	T get(){
		return value;
	}

}
