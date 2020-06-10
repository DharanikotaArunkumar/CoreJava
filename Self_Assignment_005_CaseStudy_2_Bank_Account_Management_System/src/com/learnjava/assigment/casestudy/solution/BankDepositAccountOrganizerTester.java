package com.learnjava.assigment.casestudy.solution;

import java.util.List;
import java.util.Map;

public class BankDepositAccountOrganizerTester {

	public static void main(String[] args) {
		BankDepositAccountOrganizer bankService = new BankDepositAccountOrganizer();
		// Please create this file as mentioned in case study document in your
		// location and change file path pointing to that location
		String filePath = "E:\\Java Training\\13_COMPLETE JAVA\\CompleteJavaCourse\\WEEK 4. Case Study - Self\\BankAccountData.txt";

		/*
		 * Requirement 1:- Provide the details of the customers grouped by the
		 * type of account (Savings/NRI/Wealth Mgmt)
		 */

		System.out.println("-----------------------Requirement 1-----------------------");
		Map<String, List<ParentAccountVO>> depositData = bankService.processBankDepositData(filePath);

		System.out.println("Bank Deposit Data :-  " + depositData);

		/*
		 * Requirement 2:-Calculate the maturity amount and store the data in
		 * the system.
		 */

		
		System.out.println("-----------------------Requirement 2-----------------------");
		float maturityAmount = bankService.calculateMaturityAmount("22-03-2013", "30-03-2014", 25000);

		System.out.println(" Maturity amount " + maturityAmount);

	}

}
