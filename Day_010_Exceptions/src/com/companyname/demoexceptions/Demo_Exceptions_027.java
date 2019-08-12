package com.companyname.demoexceptions;
//Even we can throw exception from main method , the runtime environment will throw excetoion .

public class Demo_Exceptions_027 {

	public static void main(String[] args) throws Exception {
		CreditCard6 card = new CreditCard6();
	
			card.saveTranscation();
		
	}

}

class CreditCard6 {

	public void saveTranscation() {
		excuteTranscation();
	}
	
	public void excuteTranscation()  {
		commitTranscation();
	}
	
	public void commitTranscation(){
		String st = null;
		st.toCharArray();
	}
}

class RewardsCreditCard6 extends CreditCard6{

	int i;
	public void getRewards() {
		
	}
}