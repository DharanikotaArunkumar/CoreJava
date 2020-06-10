package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_091_For {

	public static void main(String[] args) {

		// multi dimensional Array r

		String[] monthOfYear = new String[12];
		monthOfYear[0] = "jan";
		monthOfYear[1] = "feb";
		monthOfYear[2] = "mar";
		monthOfYear[3] = "apr";
		monthOfYear[4] = "may";
		monthOfYear[5] = "jun";
		monthOfYear[6] = "jul";
		monthOfYear[7] = "aug";
		monthOfYear[8] = "sep";
		monthOfYear[9] = "oct";
		monthOfYear[10] = "nov";
		monthOfYear[11] = "dec";

		String[] weeksOfMonth = new String[4];
		weeksOfMonth[0] = "Week1";
		weeksOfMonth[1] = "Week2";
		weeksOfMonth[2] = "Week3";
		weeksOfMonth[3] = "Week4";

		String[] days = new String[7];
		days[0] = "sun";
		days[1] = "mon";
		days[2] = "tue";
		days[3] = "wed";
		days[4] = "thr";
		days[5] = "fri";
		days[6] = "sat";
		
		String[][][] monthWeekDay =new String[monthOfYear.length][weeksOfMonth.length][days.length];

		String temp;
		for (int month = 0; month < monthOfYear.length; month++) {
			for (int week = 0; week < weeksOfMonth.length; week++) {
				for (int day = 0; day < days.length; day++) {
					
					temp =monthOfYear[month]+"-"+weeksOfMonth[week]+"-"+days[day];
					monthWeekDay[month][week][day]=temp;
					
					System.out.print(monthWeekDay[month][week][day]+"  ");

				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
