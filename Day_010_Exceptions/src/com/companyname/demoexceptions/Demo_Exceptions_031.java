package com.companyname.demoexceptions;


/*Unchecked exception does not have any such rule as checked exception , we can throw any unchecked 
exception from the code even over ridden class method does not throws any exception
*/
public class Demo_Exceptions_031 {

	public static void main(String[] args) {
		CreditCard11 card = new RewardsCreditCard11();
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

class CreditCard11 {
	public void saveTranscation() throws Exception{
		System.out.println("Inside CreditCard1");
	}	
}

class RewardsCreditCard11 extends CreditCard11  {	
	public void saveTranscation() throws NullPointerException{
		System.out.println("Inside RewardsCreditCard");
	}
}
