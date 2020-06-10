package com.companyname.demoexceptions;

// The exception propagation will be done automatically to calling method in case of run time exception
// but checked exceptions will be propagated automatically . 
public class Demo_Exceptions_023 {

	public static void main(String[] args) {
		CreditCard2 card = new CreditCard2();
		card.saveTranscation();

	}

}

class CreditCard2 {

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

class RewardsCreditCard23 extends CreditCard2{

	int i;
	public void getRewards() {
		
	}
}

