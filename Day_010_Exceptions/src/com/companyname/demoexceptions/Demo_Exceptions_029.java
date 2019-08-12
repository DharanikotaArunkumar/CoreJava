package com.companyname.demoexceptions;

//We can throw multiple exceptions from the single throws .

public class Demo_Exceptions_029 {

	public static void main(String[] args) {
		CreditCard9 card = new CreditCard9();
		System.out.println("Start");
		try{
		card.saveTranscation();
		}
		catch(Exception ex ) {
			System.out.println(ex);
		}
		
		System.out.println("End");
	}

}


class CreditCard9 {

	public void saveTranscation()throws Exception{
		excuteTranscation();
	}
	
	public void excuteTranscation() throws Exception {
		commitTranscation();
	}
	
	public void commitTranscation()throws NullPointerException,ClassNotFoundException{
		String st = null;
		Class.forName("com.companyname.demoexceptions");
	}
}

class RewardsCreditCard9 extends CreditCard9{

	int i;
	public void getRewards() {
		
	}
}