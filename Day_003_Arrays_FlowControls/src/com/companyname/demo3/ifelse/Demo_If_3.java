package com.companyname.demo3.ifelse;

public class Demo_If_3 {

	public static void main(String[] args) {
		
		// Project Tip :- 
		
		boolean isError =true;
		if(isError){
			System.out.println("Here we need to log error message why particular service been failed ");
		}else{
			System.out.println("Service been sucessfully excuted , Need to write the reposne");
		}
		 
		boolean isValid =false;
		if(!isValid){
			System.out.println("Here we need to log error message why particular service request is invalid ");
		}else{
			System.out.println("request been sucessfully excuted , Need to write the reposne");
		}

	}

}
