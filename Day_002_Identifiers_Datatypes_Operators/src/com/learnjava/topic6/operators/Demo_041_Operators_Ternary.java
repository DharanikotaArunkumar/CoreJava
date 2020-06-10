package com.learnjava.topic6.operators;

public class Demo_041_Operators_Ternary {

	public static void main(String[] args) {
	
		int a=12 ,b=13;
		
		int big;
		
		big= (a<b)? b:a;
		 
		// System.out.println(big);
		 // above program is equal to 
		 /*if (a<b){
			 big=b;
		 }else{
			 big=a;
		 }*/
		 
		 System.out.println(big);
		 
		 
		 
		
	}

}
