package com.learnjava.assigment.casestudy;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankDepositAccountOrganizer {
	
	/*
	 * Requirement 1:- Provide the details of the customers grouped by the
	 * type of account (Savings/NRI/Wealth Mgmt)
	 */
	public  Map<String, List<ParentAccountVO>> processBankDepositData(
			String filePath) throws BankOrganizerException, FileNotFoundException {
		
		Map<String, List<ParentAccountVO>> finalMap = new HashMap<String, List<ParentAccountVO>>();
		
		// TODO
		return finalMap;
		
		
	}
	
	/*
	 * Requirement 2:-Calculate the maturity amount and store the data in
	 * the system.
	 */
	public float calculateMaturityAmount(Date date1, Date date2,int depositamount){
		float maturity_amount=0.00f;
		
		// TODO
		
		return maturity_amount;
		
		
	}
	
	
	
}


