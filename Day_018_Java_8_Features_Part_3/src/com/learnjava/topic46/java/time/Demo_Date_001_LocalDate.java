package com.learnjava.topic46.java.time;

import java.time.LocalDate;
import java.time.ZoneId;

public class Demo_Date_001_LocalDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();	
		
		System.out.println(date);
		
		LocalDate defaultDate = LocalDate.now(ZoneId.systemDefault());
		
		System.out.println(defaultDate);
	}

}
