package com.learnjava.topic6.operators;

public class Demo_040_Operators_Boolean {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=true;
		if(a&b){
			System.out.println("true");
		}
		
		
		if(a|b){
			System.out.println("true");
		}
		a=false;
		
		if(!a){
			System.out.println("true");
		}
		
	}

}
