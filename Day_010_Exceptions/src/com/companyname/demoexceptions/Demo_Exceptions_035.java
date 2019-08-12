package com.companyname.demoexceptions;

// Exception re throwing 
public class Demo_Exceptions_035 {

	public static void main(String[] args) {
		try {
			
			verifyCardDetilaes("123456789");
			verifyUserInfo("123456789", "");
			withDrawAmount(12345);
			} catch (AccountNumberNotFoundException2 ex) {
				throw ex;
			} catch (AccountInfoNotFOundException2 ex) {
				System.out.println("enter proper pin number ");
			}
		
	}
		public static void verifyCardDetilaes(String cardno) {
			if (null == cardno || cardno.length() == 0) {
				throw new AccountNumberNotFoundException2("e");
			}

		}

		public static void verifyUserInfo(String cardno, String pinno) {
			if (null == cardno || pinno.length() == 0) {
				System.out.println("Account number not found");
				throw new AccountInfoNotFOundException2("e");
			}

		}

		public static void withDrawAmount(double amount) {
			System.out.println("with draw is sucessfully");
		}
	

}

class AccountNumberNotFoundException2 extends RuntimeException {

	public AccountNumberNotFoundException2(String msg) {
		super(msg);
	}

}

class AccountInfoNotFOundException2 extends RuntimeException {

	public AccountInfoNotFOundException2(String msg) {
		super(msg);
	}
}
