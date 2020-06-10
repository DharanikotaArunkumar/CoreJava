package com.learnjava.topic8.controlstatements.demo2.switchStatement;

public class Demo_070_Switch {

	public static void main(String[] args) {
		// Break is used to come out of the flow control 
		String choice = "Orange";

		switch (choice) {

		case "Red":
			System.out.println("You have choosen Red");
			break;
		case "Green":
			System.out.println("You have choosen Green");
			
		case "White":
			System.out.println("You have choosen White");
			break;
		case "Orange":
			System.out.println("You have choosen Orange");
			break;
		case "Blue":
			System.out.println("You have choosen Blue");

		}

	}
}
