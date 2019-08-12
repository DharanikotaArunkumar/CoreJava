package com.companyname.demo5.logical;

public class Demo_Logical_1 {

	public static void main(String[] args) {
		//logical operators constructs the compound expressions or statements .
		// 1) && :- and operator 
		//    && means compulsory all  conditions satisfy 
		
		int a=1,b=1,c=1;
		
		if(a==1 && b==1 && c==1){
			System.out.println("all conditions satisfy ");
		}
		
		// if any condition is failed then run time environment will not check rest of the conditions 
		
		b=0;
		if(a==1 && b==1 && c==1){
			System.out.println("c==1 will be tested ");
		}
		
		// always check the object null , before we retrieve any value from object and make sure && operator is used  .
		
		
		
		
		
		// 2) ||:- or operator 
		//    || means anyone  condition satisfy is fine
		
		a=0 ;
		b=0;
		c=0;
		if(a==1 || b==1 || c==1){
			System.out.println("one  conditions satisfy ");
		}
		
		// if any condition is true then run time environment will not check rest of the conditions 
				a=1;
				b=0;
				c=1;
				if(!(a==0) || b==1 || c==1){
					System.out.println("c==1 will be tested ");
				}
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
