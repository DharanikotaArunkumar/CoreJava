package com.companyname.demo6.dowhile;

public class Demo_Do_While_1 {

	public static void main(String[] args) {
		
		// When we want to execute the pieces of code to executed at least once irrespective of the condition then we should use do while
		int i=2;
		do{
			System.out.println("value of i "+i);
			i++;
		}while(i<5);
		
		int j =2 ;		
		while(j<0){
			
			System.out.println("value of j "+j);
			j++;
			
		}

	}

}
