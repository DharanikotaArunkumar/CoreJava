package com.companyname.demo6.instanceblockdemo;

import java.util.Calendar;
import java.util.Date;

/*
 * like methods and constructors instance block can not take arguments 
 */

class CarSold5 {

	String name;
	static int count; 
	

	{
		
		Calendar calendar = Calendar.getInstance();
		Date dateObj= calendar.getTime();
		
		String date=""+dateObj.getYear()+dateObj.getMonth()+dateObj.getDay();
		count++;
		name ="IND-Temp-";
		System.out.println("Temporary registration completed and car temp registration is "+name+date+"-"+count);
	}

	

}

public class Demo_Constructors_06_Initialization_Block {

	public static void main(String[] args) {

		
		CarSold5 audi = new CarSold5();
		System.out.println("\n\n");
		CarSold5 bmw = new CarSold5();
		System.out.println("\n\n");
	
	}
}
