package com.learnjava.assigment.casestudy.solution;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Validator {

	private static final Logger LOG = Logger.getLogger("Validator");

	/*
	 * 1. All fields are mandatory.
	 * 
	 **/

	public static boolean mandatoryFiledCheck(String[] data) {

		boolean flag = true;

		if (data[0].isEmpty() || data[1].isEmpty() || data[2].isEmpty() || data[3].isEmpty() || data[4].isEmpty()
				|| data[5].isEmpty()) {
			LOG.log(Level.SEVERE, "All fileds are mandatory validation failed");
			flag = false;
		}

		return flag;
	}

	/*
	 * 2. The account number should be numeric and should not start with 0
	 * 
	 */
	public static boolean isValidAccountNumber(String accountNumber) {

		boolean flag = true;

		// Checking null ,is empty or not ,should not start with zero (0) and
		// account number is numeric
		if (accountNumber == null || accountNumber.isEmpty() || accountNumber.charAt(0) == 0
				|| !accountNumber.matches("[0-9]*")) {
			flag = false;
			LOG.log(Level.SEVERE, "There is an error in validating Account Number ");
		}

		return flag;
	}

	/*
	 * 3.Both the dates in the input file should be in dd-MM-yyyy format.
	 * 
	 */

	public static boolean isValidDate(String dateStr) {

		boolean flag = true;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			LocalDate.parse(dateStr, formatter);
		} catch (DateTimeParseException dateTimeParseExp) {
			LOG.log(Level.SEVERE, "There is an error in validating Date text");
			flag = false;
		}

		return flag;
	}

	/*
	 * 4. The possible values for type of account fields are WM,SAV,NRI (Please
	 * note that all the above text is in upper case )
	 * 
	 */

	public static boolean isValidAccountType(String accountType) {
		boolean flag = true;

		if (!(accountType.equals("WM") || accountType.equals("SAV") || accountType.equals("NRI"))) {
			LOG.log(Level.SEVERE, "Type of account is not valid");
			flag = false;
		}
		return flag;
	}

	/*
	 * 5. The LinkedDepositAccNumber should start with one of the below options
	 * FD,RD,MUT (Please note that all the above text is in upper case )
	 * 
	 */
	public static boolean isValidLinkedDeposit(String linkedDeposit) {
		boolean flag = true;
		
		if (!(linkedDeposit.startsWith("FD") ||linkedDeposit.startsWith("RD")
				|| linkedDeposit.startsWith("MUT"))) {
			LOG.log(Level.SEVERE, "Linked Deposit  account is not valid");
			flag = false;
		}
		
		return flag;
	}


}