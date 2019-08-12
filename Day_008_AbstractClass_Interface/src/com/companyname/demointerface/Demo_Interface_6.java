package com.companyname.demointerface;


interface Shape3{
	void diaplyArea();
}

interface circle {
	void displayRadius();
}

interface Square extends Shape3{ // Same entities so extends 
	void dispalyDia();
	
}


class p{
	
}


class g{
	
}


class h extends p{
	
}

public class Demo_Interface_6 implements Shape3,circle{// different entities so implements 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayRadius() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diaplyArea() {
		// TODO Auto-generated method stub
		
	}

}
