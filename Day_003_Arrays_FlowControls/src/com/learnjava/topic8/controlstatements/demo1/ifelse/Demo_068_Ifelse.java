package com.learnjava.topic8.controlstatements.demo1.ifelse;


import java.util.Calendar;
import java.util.Date;


public class Demo_068_Ifelse {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		Date date= calendar.getTime();
		int hour =date.getHours();
		
		//hour =25;
		System.out.println("Hours :- "+hour);
		
		
		if(hour>4 && hour<12){
			System.out.println("Good Morning...!!!");
		}else if(hour >=12 &&hour<=16){
			System.out.println("Good Afternoon...!!!");
		}else if (hour>16 && hour<20){
			System.out.println("Good Evning...!!!");
		}else if(hour>=20 && hour<24){
			System.out.println("Good Night ...!!!");
		}else{
			System.out.println("invalide Time");
		}
		
	}

}
