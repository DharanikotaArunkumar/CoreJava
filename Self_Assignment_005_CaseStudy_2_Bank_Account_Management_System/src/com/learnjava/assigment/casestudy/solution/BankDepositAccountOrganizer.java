package com.learnjava.assigment.casestudy.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankDepositAccountOrganizer {

	
	/*
	 * Requirement 1:- Provide the details of the customers grouped by the
	 * type of account (Savings/NRI/Wealth Mgmt)
	 */
	public Map<String, List<ParentAccountVO>> processBankDepositData(String filePath) {

		Map<String, List<ParentAccountVO>> finalMap = new HashMap<String, List<ParentAccountVO>>();

		try {
			BankDepositAccountOrganizer bao = new BankDepositAccountOrganizer();
			String s1 = null;
			BufferedReader bufferedReader = null;
			File file = new File(filePath);
			System.out.println(" FilePath : " + filePath + "\t " + ", File exist : " + file.exists());
			if (file.exists()) {
				FileReader fileReader = new FileReader(file);
				bufferedReader = new BufferedReader(fileReader);
				// br = new BufferedReader(new FileReader(filePath));

				try {

					List<ParentAccountVO> pst1 = new ArrayList<ParentAccountVO>();
					List<ParentAccountVO> pst2 = new ArrayList<ParentAccountVO>();
					List<ParentAccountVO> pst3 = new ArrayList<ParentAccountVO>();

					while ((s1 = bufferedReader.readLine()) != null) {
						System.out.println(" File Data :  " + s1);
						String[] values = s1.split(",");
						/*
						 * for (String s : values) System.out.println(s);
						 */
						boolean valResult = validateData(values);

						ParentAccountVO po = new ParentAccountVO();

						if (!valResult) {
							String message = "validation failed";
							throw new BankOrganizerException(message);
						} else {
							List<LinkedDepositVO> lst = new ArrayList<LinkedDepositVO>();

							LinkedDepositVO ld = new LinkedDepositVO();
							int depositamount = Integer.parseInt(values[4]);
							ld.setDepositAmount(depositamount);
							String da = values[5];
							LocalDate date1 = getDate(da);
							String db = values[6];
							LocalDate date2 = getDate(db);
							/*
							 * System.out.println("Deposit Start Date" + date1);
							 * System.out.println("Deposit Maturity Date" +
							 * date2); System.out.println("Deposit Amount" +
							 * Integer.parseInt(values[4])); System.out.println(
							 * "Deposit No" + values[3]); System.out.println(
							 * "Maturity Amount" +
							 * bao.calculateMaturityAmount(da, db,
							 * depositamount));
							 */
							ld.setLinkedDepositNo(values[3]);
							ld.setDepositStartDate(date1);
							ld.setDepositMaturityDate(date2);
							ld.setMaturityAmount(bao.calculateMaturityAmount(da, db, depositamount));

							boolean flag = false;

							if (values[2].equals("WM")) {

								for (ParentAccountVO parentAccountVO : pst1) {

									if (parentAccountVO.getParentAccNo() == Integer.parseInt(values[0])) {
										flag = true;
										List<LinkedDepositVO> linkedDepositVOs = parentAccountVO.getLinkedDeposits();
										linkedDepositVOs.add(ld);
									}

								}

							}

							if (values[2].equals("SAV")) {

								for (ParentAccountVO parentAccountVO : pst2) {

									if (parentAccountVO.getParentAccNo() == Integer.parseInt(values[0])) {
										flag = true;
										List<LinkedDepositVO> linkedDepositVOs = parentAccountVO.getLinkedDeposits();
										linkedDepositVOs.add(ld);
									}

								}

							}
							if (values[2].equals("NRI")) {

								for (ParentAccountVO parentAccountVO : pst3) {

									if (parentAccountVO.getParentAccNo() == Integer.parseInt(values[0])) {
										flag = true;
										List<LinkedDepositVO> linkedDepositVOs = parentAccountVO.getLinkedDeposits();
										linkedDepositVOs.add(ld);
									}

								}

							}

							if (!flag) {
								lst.add(ld);
								po.setAccType(values[2]);
								po.setName(values[1]);
								po.setParentAccNo(Integer.parseInt(values[0]));
								po.setLinkedDeposits(lst);
								if (values[2].equals("WM")) {
									pst1.add(po);
								}
								if (values[2].equals("SAV")) {
									pst2.add(po);
								}
								if (values[2].equals("NRI")) {
									pst3.add(po);
								}
							}

						}
					}

					finalMap.put("WM", pst1);

					finalMap.put("SAV", pst2);

					finalMap.put("NRI", pst3);

					// System.out.println("Final Map is " + finalMap.get("WM"));

				} catch (IOException | BankOrganizerException e) {

					// e.printStackTrace();

				}

				try {
					bufferedReader.close();
					fileReader.close();
					

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			else {

			}

		} catch (FileNotFoundException e) {

		}

		return finalMap;

	}

	/*
	 * Requirement 2:-Calculate the maturity amount and store the data in
	 * the system.
	 */
	
	public float calculateMaturityAmount(String fromDateStr, String toDateStr, int depositamount) {
		float maturity_amount = 0.00f;

		LocalDate fromDate = getDate(fromDateStr);
		LocalDate toDate = getDate(toDateStr);
		long noofdays = daysBetween(fromDate, toDate);
		
		

		System.out.println(" No of days money deposited with bank :  " + noofdays);

		if (noofdays >= 0 && noofdays <= 200) {
			maturity_amount = (float) (depositamount + (depositamount * 6.75 / 100));
		} else if (noofdays >= 201 && noofdays <= 400) {
			maturity_amount = (float) (depositamount + (depositamount * 7.5 / 100));
		} else if (noofdays >= 401 && noofdays <= 600) {
			maturity_amount = (float) (depositamount + (depositamount * 8.75 / 100));
		} else {
			maturity_amount = (float) (depositamount + (depositamount * 10 / 100));

		}

		return maturity_amount;

	}

	/*
	 * Convert String to Date
	 */
	private static LocalDate getDate(String dateStr) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		return LocalDate.parse(dateStr, formatter);

	}

	/*
	 * Days between
	 */
	private long daysBetween(LocalDate fromDate, LocalDate toDate) {

		long daysBetween = ChronoUnit.DAYS.between(fromDate, toDate);

		return daysBetween;
	}

	/*
	 * Validation Code
	 */

	public static boolean validateData(String[] str) {

		boolean result = true;

		// All fields mandatory check

		if (!Validator.mandatoryFiledCheck(str)) {
			result = false;
		}

		// Account number validation

		if (!Validator.isValidAccountNumber(str[0])) {
			result = false;
		}

		// Account Type

		if (!Validator.isValidAccountType(str[2])) {
			result = false;
		}

		// Linked Deposit validation

		if (!Validator.isValidLinkedDeposit(str[3])) {
			result = false;
		}

		// Deposit Start date validation

		if (!Validator.isValidDate(str[5])) {
			result = false;
		}

		// Deposit Maturity date validation

		if (!Validator.isValidDate(str[6])) {
			result = false;
		}
		return result;

	}

}
