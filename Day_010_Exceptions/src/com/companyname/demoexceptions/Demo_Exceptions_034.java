package com.companyname.demoexceptions;

/*in this program we have created the new custom exception with is extended from the runtime exception 

, so that exception unwinding will be done automatically .
*/
public class Demo_Exceptions_034 {

	public static void main(String[] args) {
		BankManager1 manager = new BankManager1();
		try {
			manager.verifyCardDetilaes("");
			manager.verifyUserInfo("123456789", "");
			manager.withDrawAmount(12345);

		} catch (AccountNumberNotFoundException ex) {
			System.out.println("insert proper card"+ex.getMessage());
		} catch (AccountInfoNotFOundException ex) {
			System.out.println("enter proper pin number ");
		}
	}

}
class BankManager1 {
	public void verifyCardDetilaes(String cardno) {
		if (null == cardno || cardno.length() == 0) {
			throw new AccountNumberNotFoundException("Card number empty");
		}

	}

	public void verifyUserInfo(String cardno, String pinno) {
		if (null == cardno || pinno.length() == 0) {
			throw new AccountInfoNotFOundException("e");
		}

	}

	public void withDrawAmount(double amount) {
		System.out.println("with draw is sucessfully");
	}
}

class AccountNumberNotFoundException extends RuntimeException {

	
	public AccountNumberNotFoundException(String msg) {
		super(msg);
	}

}

class AccountInfoNotFOundException extends RuntimeException {

	public AccountInfoNotFOundException(String msg) {
		super(msg);
	}
}
