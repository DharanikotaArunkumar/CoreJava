package com.companyname.demoexceptions;
/*
When super class overridden method throws exception , sub class over ridden method do not we 
need to have throws exception . here "saveTranscation" method in the RewardsCreditCard class
does not have throws exception but super class has throws exception . 
But reserver is not possible
*/






public class Demo_Exceptions_030 {

	public static void main(String[] args) {
		CreditCard10 card = new RewardsCreditCard10();
		System.out.println("Start");
		try{
		card.saveTranscation();
		}catch(Exception ex)
		{
			System.out.println("catch"); 
		}
		System.out.println("End"); 
	}

}

class CreditCard10 {
	public void saveTranscation()throws ClassNotFoundException{
		System.out.println("Inside CreditCard1");
	}	
}

class RewardsCreditCard10 extends CreditCard10{	
	public void saveTranscation() {
		
		String str = null;
		str.toLowerCase();
		System.out.println("Inside RewardsCreditCard");
	}
}