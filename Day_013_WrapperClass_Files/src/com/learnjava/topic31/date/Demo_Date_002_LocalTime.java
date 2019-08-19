package com.learnjava.topic31.date;

import java.time.LocalTime;
import java.time.ZoneId;

public class Demo_Date_002_LocalTime {

	public static void main(String[] args) {
		LocalTime presentTime = LocalTime.now();

		System.out.println(presentTime);

		LocalTime istTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));

		System.out.println(istTime);

		LocalTime chicagoTime = LocalTime.now(ZoneId.of("America/Chicago"));

		System.out.println(chicagoTime);
	}

}
