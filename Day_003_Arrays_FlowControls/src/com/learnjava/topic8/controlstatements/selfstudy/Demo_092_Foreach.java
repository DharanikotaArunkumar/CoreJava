package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_092_Foreach {

	public static void main(String[] args) {
		// double dimensional Array retrieval
				String[] weeksOfMonth = new String[4];
				weeksOfMonth[0] = "Week1";
				weeksOfMonth[1] = "Week2";
				weeksOfMonth[2] = "Week3";
				weeksOfMonth[3] = "Week4";
				
				System.out.println("Weeks of month :-  ");

				for (int i = 0; i < weeksOfMonth.length; i++) {
					System.out.println(weeksOfMonth[i]);
				}
				

				String[] days = new String[7];
				days[0] = "sun";
				days[1] = "mon";
				days[2] = "tue";
				days[3] = "wed";
				days[4] = "thr";
				days[5] = "fri";
				days[6] = "sat";
				System.out.println("Days in a Week  :-");

				for (int i = 0; i < days.length; i++) {
					System.out.println(days[i]);
				}
				
				String [][] weekDay = new String[4][7];
								
				//values insertion and retrieval
				for (int week = 0; week < weeksOfMonth.length; week++) {
					
					for (int day = 0; day<days.length ; day++) {
						
						weekDay[week][day]=days[day];
				
						System.out.println(" value in weekDay [" + week + "][" + day + "] :- " + weekDay[week][day]);
						
					}
					System.out.println();
				}

				for(String[] weekArray:weekDay){
					for(String day:weekArray)
					{
						System.out.println(" printing value from for each loop "+day);
						
					}
				}
	}

}
