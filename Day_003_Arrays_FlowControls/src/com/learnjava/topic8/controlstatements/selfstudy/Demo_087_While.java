package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_087_While {

	public static void main(String[] args) {
		//1) While expects boolean as return type .
		
		/*int i =0;		
		while (i){
			System.out.println(" Sorry ...!!! There is some problem with code ..i can not be printed :(");
		}*/

		
		//2) {} is not mandatory of while loop .
		
		/*int ii=0;
		while(ii<12)
		ii++;*/
		
		
		//above program is same as 
		/*int iii=0;
		while(iii<12){
			System.out.println("While Loop Says :- I recommand you , write like this ");
			ii++;
		}
		*/
		
		
			
		//4) compliers knows final so those values not be changed . Complier will replace the x with value while compilation only
		final int x=10,y=20;
		while(x<y){
			System.out.println("hello");
		}
		//System.out.println("i am probamatic statement ?");
		
	}

}
