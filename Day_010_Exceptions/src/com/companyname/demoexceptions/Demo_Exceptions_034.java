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

		} catch (AccountNumberNotFoundException1 ex) {
			System.out.println("insert proper card");
		} catch (AccountInfoNotFOundException1 ex) {
			System.out.println("enter proper pin number ");
		}
	}

}
class BankManager1 {
	public void verifyCardDetilaes(String cardno) {
		if (null == cardno || cardno.length() == 0) {
			throw new AccountNumberNotFoundException1("e");
		}

	}

	public void verifyUserInfo(String cardno, String pinno) {
		if (null == cardno || pinno.length() == 0) {
			throw new AccountInfoNotFOundException1("e");
		}

	}

	public void withDrawAmount(double amount) {
		System.out.println("with draw is sucessfully");
	}
}

class AccountNumberNotFoundException1 extends RuntimeException {

	
	public AccountNumberNotFoundException1(String msg) {
		super(msg);
	}

}

class AccountInfoNotFOundException1 extends RuntimeException {

	public AccountInfoNotFOundException1(String msg) {
		super(msg);
	}
}
