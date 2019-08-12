/*
 * 	"A deprecated class or method is no longer important. It is so unimportant, in fact, 
 * that you should no longer use it, since it has been superseded and may cease to exist in the future."
 * 
 * Many method in date class made as Deprecated.
 */

package com.companyname.module.submodule.annotations;

import java.util.Calendar;
import java.util.Date;

public class Demo_Annotations_2_Deprecated_Example1 {

	public static void main(String[] args) {

		Date date = new Date();
		// When we use IDE it shows like below ..strict line  deprecated method 
		
		 /*@Deprecated
		    public int getDate() {
		        return normalize().getDayOfMonth();
		    }
		 */
		
		int todayDate = date.getDate();
	
		int thisHour = date.getHours();
		System.out.println("Today Date is " + todayDate);
		System.out.println("This Hour is " + thisHour);
		
		System.out.println("--------------------");
		Calendar cal = Calendar.getInstance();		
		 todayDate = cal.get(Calendar.DATE);
		 thisHour =cal.get(Calendar.HOUR_OF_DAY);
		 
		 System.out.println("Today Date is " + todayDate);
		System.out.println("This Hour is " + thisHour);

		

	}

}
