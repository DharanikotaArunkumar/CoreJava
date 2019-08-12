package com.companyname.demoexceptions;
// Example of propagation  

public class Demo_Exceptions_025 {

	public static void main(String[] args) {
		CreditCard4 card = new CreditCard4();
		try {
			card.saveTranscation();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class CreditCard4 {

	public void saveTranscation() throws ClassNotFoundException {
		excuteTranscation();
	}
	
	public void excuteTranscation() throws ClassNotFoundException {
		commitTranscation();
	}
	
	public void commitTranscation() throws ClassNotFoundException {
		String st = null;
		System.out.println(st.toLowerCase());
		Class.forName("com.companyname.demoexceptions.xyz");
	}
}

class RewardsCreditCard4 extends CreditCard4{

	int i;
	public void getRewards() {
		
	}
}