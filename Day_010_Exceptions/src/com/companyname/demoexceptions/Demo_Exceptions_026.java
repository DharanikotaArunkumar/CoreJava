package com.companyname.demoexceptions;


/*In normal try catch block , if we do not have any statement which throws checked exception and
 *  still be have checked exception catch block , complier will not compile the code .

Here in the above program "commitTranscation" method does not have any ClassNotFoundException ,
but we can throw the checked exception to calling method .even we do not have any statement 
which can raise CheckedEXception .

The Rule is applicable for only try, catch block not for the methods , Methods can throw the checked
 exception even the code inside method does not throw any checked exception .
*/public class Demo_Exceptions_026 {

	public static void main(String[] args) {
		CreditCard5 card = new CreditCard5();
		System.out.println("Start");
		try {
			card.saveTranscation();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}


class CreditCard5 {

	public void saveTranscation() throws ClassNotFoundException{
		excuteTranscation();
	}
	
	public void excuteTranscation() throws ClassNotFoundException {
		commitTranscation();
	}
	
	public void commitTranscation()throws ClassNotFoundException{
		String st = null;
		
		st.toLowerCase();
		// Here i did not have any checked exception raising statement , still i am throwing checked exception
		
	}
}

class RewardsCreditCard5 extends CreditCard5{

	int i;
	public void getRewards() {
		
	}
}