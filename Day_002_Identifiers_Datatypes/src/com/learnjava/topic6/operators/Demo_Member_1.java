package com.companyname.demo10.member;



public class Demo_Member_1 {

	public static void main(String[] args) {
		// (.) is called member operator or dot operator 
		// its tells about the member of package or class .
		int a=10,b=12;
		Math.max(a, b);//max is the member of Math class 
		
		
		
		LandLine landLine = new LandLine();
		
		landLine.phoneName ="iPhone";

		
		

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