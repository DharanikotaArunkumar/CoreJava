package com.learnjava.topic6.operators;

public class Demo_Ternary_1 {

	public static void main(String[] args) {
	
		int a=12 ,b=13;
		
		int big;
		
		big= (a<b)? b:a;
		 
		// System.out.println(big);
		 // above program is equalient to 
		 /*if (a<b){
			 big=b;
		 }else{
			 big=a;
		 }*/
		 
		 System.out.println(big);
		 
		 
		 
		
	}

}
