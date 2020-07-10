package com.companyname.demoexceptions;

/*when ever we got the exception scenario , then we can raise the exception by using throw  keyword .
Throw is a keyword which is used to raise exception exepicitly .*/

public class Demo_Exceptions_033 {

	public static void main(String[] args) {
		BankManager manager = new BankManager();
		try{	manager.verifyCardDetilaes("asdas");
		manager.verifyUserInfo("123456789","1234");
		manager.verifyAcountBalance(0);
		manager.verifyLimitpPerDayForUser(12345);
		manager.withDrawAmount(12345);
			
		} catch(NullPointerException ex){
			System.out.println("insert proper card");
		}
		catch(ClassCastException ex){
			System.out.println("enter proper pin number ");
		}
		catch(ArithmeticException ex){
			System.out.println("enter amount should be greater then zero ");
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println("enter amount should be greater then zero or corrosed limit");
		}
	}

}

class  BankManager {
	public void verifyCardDetilaes (String cardno){
		if(null == cardno ||cardno.length() == 0){
			throw new NullPointerException("e");
		}
		
	}
	
	public void verifyUserInfo(String cardno, String pinno){
		if(null == cardno ||pinno.length() == 0){
			throw new ClassCastException("e");
		}
		
	}
	
	public void verifyAcountBalance(double amount){
		if(amount<=0){
			throw new ArithmeticException("e");
		}
	}
	
	public void verifyLimitpPerDayForUser(double amount){
		if(amount<0){
			throw new IndexOutOfBoundsException("e");
		}
		
	}
	
	public void withDrawAmount(double amount){
		System.out.println("with draw is sucessfully");
	}
}