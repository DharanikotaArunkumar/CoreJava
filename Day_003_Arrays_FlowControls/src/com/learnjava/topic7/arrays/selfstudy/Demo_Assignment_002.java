package com.learnjava.topic7.arrays.selfstudy;

// Write a program to display the calendar by using arrays
public class Demo_Assignment_002 {

	public static void main(String[] args) {

		int yearInput = 2019;
		int startDay = 1;
		int febMonDays = (yearInput % 4 == 0 ? 29 : 28);
		int[] totalDaysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		totalDaysInMonth[1] = febMonDays;
		int[][][] date = new int[12][6][7];

		for (int month = 0; month < 12; month++) {
			int totalNoOfDays = totalDaysInMonth[month];
			boolean flag = true;
			int presentDate = 0;

			for (int week = 0; week < 6; week++) {
				for (int day = 0; day < 7; day++) {
					if (day == startDay && flag) {
						flag = false;
						date[month][week][day] = ++presentDate;
					} else if (flag) {
						continue;
					} else if (presentDate < totalNoOfDays) {
						flag = false;
						date[month][week][day] = ++presentDate;
					}
				}
			}
			startDay = (totalNoOfDays + startDay) % 7;
		}

		for (int month = 0; month < 12; month++) {
			System.out.println("Month "+(month+1));
			System.out.println("\nMo Tu We Th Fr Sa Su\n");
			for (int week = 0; week < 6; week++) {

				for (int day = 0; day < 7; day++) {
					int dateValue = date[month][week][day];
					if (dateValue == 0) {
						System.out.print("   ");
					} else if (dateValue < 10) {
						System.out.print("0" + dateValue + " ");
					} else {
						System.out.print(dateValue + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
