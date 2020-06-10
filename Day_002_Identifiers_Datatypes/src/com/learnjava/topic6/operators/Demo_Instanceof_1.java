package com.companyname.demo9.instanceofoperator;

public class Demo_Instanceof_1 {

	public static void main(String[] args) {

		LandLine phone = new LandLine();

		if (phone instanceof LandLine) {
			System.out.println("i am landline type");
		}
		// TODO Auto-generated method stub

	}

}

class LandLine {
	String phoneName;
	String modelNumber;
	long phoneNumber;
	float creditBalnace;
	boolean isRoamingAllowed;
	boolean isIntCallActive;
}