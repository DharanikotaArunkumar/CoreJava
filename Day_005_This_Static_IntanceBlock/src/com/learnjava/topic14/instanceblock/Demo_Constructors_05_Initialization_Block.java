package com.learnjava.topic14.instanceblock;

import java.util.Calendar;
import java.util.Date;

/*
 * Instance Block can access the static and non static variables
 */

class CarSold4 {

	String name;
	static int count; 
	
	static{
		System.out.println();
	}
	

	{
		
		Calendar calendar = Calendar.getInstance();
		Date dateObj= calendar.getTime();
		
		String date=""+dateObj.getYear()+dateObj.getMonth()+dateObj.getDay();
		count++;
		name ="TN-08-";
		System.out.println("Temporary registration completed and car temp registration is "+name+date+"-"+count);
	}

	

}

public class Demo_Constructors_05_Initialization_Block {

	public static void main(String[] args) {

		
		CarSold4 audi = new CarSold4();
		System.out.println("\n\n");
		CarSold4 bmw = new CarSold4();
		System.out.println("\n\n");
		CarSold4 bmw1 = new CarSold4();
		CarSold4 bmw2 = new CarSold4();
		CarSold4 bmw3 = new CarSold4();
		CarSold4 bmw4 = new CarSold4();
	
	}
}
