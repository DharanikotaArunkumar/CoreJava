package com.learnjava.topic32.generics;

public class Demo_002_General_Solution_For_Problem {

	public static void main(String[] args) {
	
		Store1 store = new Store1(); 
		
		// Program 1
		store.setObj("Effective Java"); // Solution :- It can have string 
		String bookName = (String) store.getObj();
		System.out.println(" Book Name :"+bookName);
		
		// Program 2
		
		store.setObj(570.75);
		Double price = (Double) store.getObj(); // solution :- it can double 
		System.out.println(" Book Price "+price);
		
		
		
		
		// Problem :-
		
		// Again programmer 1 wanted to retrieve book name .
		bookName = (String) store.getObj(); // Class Cast exception .
		System.out.println(" Book Name :"+bookName);
		
		
		/* 1) TOO much generic 
		   2)Explicit type casting required .
           3) might throw runtime exception .*/
		
		
	}

}
