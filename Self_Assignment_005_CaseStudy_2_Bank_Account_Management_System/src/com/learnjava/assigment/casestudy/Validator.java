package com.learnjava.assigment.casestudy;

public class Validator {

	
	/*
	 * 1. All fields are mandatory.
	 * 
	 **/

	public static boolean mandatoryFiledCheck(String[] data) {

		boolean flag = true;

		// TODO

		return flag;
	}

	/*
	 * 2. The account number should be numeric and should not start with 0
	 * 
	 */
	public static boolean isValidAccountNumber(String accountNumber) {

		boolean flag = true;

		// TODO

		return flag;
	}

	/*
	 * 3.Both the dates in the input file should be in dd-MM-yyyy format.
	 * 
	 */

	public static boolean isValidDate(String dateStr) {

		boolean flag = true;
		
		// TODO

		return flag;
	}

	/*
	 * 4. The possible values for type of account fields are WM,SAV,NRI (Please
	 * note that all the above text is in upper case )
	 * 
	 */

	public static boolean isValidAccountType(String accountType) {
		boolean flag = true;

		// TODO
		
		return flag;
	}

	/*
	 * 5. The LinkedDepositAccNumber should start with one of the below options
	 * FD,RD,MUT (Please note that all the above text is in upper case )
	 * 
	 */
	public static boolean isValidLinkedDeposit(String linkedDeposit) {
		boolean flag = true;
		
		// TODO
		
		return flag;
	}

}