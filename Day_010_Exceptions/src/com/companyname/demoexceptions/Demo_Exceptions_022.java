package com.companyname.demoexceptions;

// Example of exception propogation  
public class Demo_Exceptions_022 {

	public static void main(String[] args) {
		CreditCard1 card = new CreditCard1();
		card.saveTranscation();
	}

}
class CreditCard1 {

	public void saveTranscation() {
		excuteTranscation();
	}
	
	public void excuteTranscation() {
		commitTranscation();
	}
	
	public void commitTranscation() {
		String st = null;
		st.toLowerCase();
	}
}

class RewardsCreditCard extends CreditCard1{

	int i;
	public void getRewards() {
		
	}
}
