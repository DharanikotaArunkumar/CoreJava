package com.companyname.demoexceptions;

/*We can throw the super class of particular exception .
 * Here "Class.forName("com.companyname.demoexceptions.xyz");" will throw the ClassNotFoundException 
 *  but we are throwing its super class "throws Exception " to the calling method . but the hierarchy
 *   of the throw should be increased order or same but should not decrease , i.e 
we are throwing exception if in the above calling method we should not throw ClassNotFoundExcetption .
 it should have to throw the "EXceotion" only
*/
public class Demo_Exceptions_028 {

	public static void main(String[] args) {
		CreditCard8 card = new CreditCard8();
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

class CreditCard8 {

	public void saveTranscation()throws Exception{
		excuteTranscation();
	}
	
	public void excuteTranscation() throws Exception {
		commitTranscation();
	}
	
	public void commitTranscation()throws ClassNotFoundException{
		String st = null;
		Class.forName("com.companyname.demoexceptions.xyz");
		st.toCharArray();
	}
}

class RewardsCreditCard8 extends CreditCard8{

	int i;
	public void getRewards() {
		
	}
}