package com.companyname.demoexceptions;
// in case of checked exception the propagation will not be happened .We need to use the throws
//keyword .

public class Demo_Exceptions_024 {

	public static void main(String[] args) throws ClassNotFoundException {
		CreditCard3 card = new CreditCard3();
		
			card.saveTranscation();
			
			String
		
	}

}
class CreditCard3 {

	public void saveTranscation() throws ClassNotFoundException {
		excuteTranscation();
	}
	
	public void excuteTranscation() throws ClassNotFoundException   {
		commitTranscation();
	}
	
	public void commitTranscation() throws ClassNotFoundException  {
		String st = null;
		st.toLowerCase();
		Class.forName("com.companyname.demoexceptions.xyz");
	}
}

class RewardsCreditCard3 extends CreditCard3{

	int i;
	public void getRewards() {
		
	}
}