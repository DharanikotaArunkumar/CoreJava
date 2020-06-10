package com.learnjava.topic6.operators;

public class Demo_044_Operators_Instanceof {

	public static void main(String[] args) {
		
		String name = new String("vijay");
		
		boolean isStringObject = name instanceof String;

		System.out.println("isStringObject :- " +isStringObject );

	}

}

