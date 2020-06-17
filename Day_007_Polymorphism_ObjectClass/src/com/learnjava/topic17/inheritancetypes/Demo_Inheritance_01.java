package com.learnjava.topic17.inheritancetypes;

/*
 * Single Inheritance
 * 
 *   
 * 	 											  Shape
 *	  												|
 *	           									  Circle
*/	


class Shape {
	
	float aera ;
	
	Shape(){
		System.out.println(" Shape constructor is called .....!!! ");
		
	}
		
}

class Circle extends Shape {
	
	int radi;
	float PI=3.14f;
	
	
	public Circle(int inputRadius) {
		System.out.println(" Circle constructor is called .....!!! ");
	System.out.println("The value of aera is :-  "+aera);
		radi = inputRadius;
	}


	void calArea(){
		
		
		aera = PI *radi*radi;
		System.out.println(aera);
		
	}
}

public class Demo_Inheritance_01 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(12);
		
		circle.calArea();
		
		
	}

}
