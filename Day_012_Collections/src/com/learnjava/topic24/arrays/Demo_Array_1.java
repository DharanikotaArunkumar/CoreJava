package com.companyname.demo1.arrays;

/*
 * We are not to new to collections topic , We already discussed about it during arrays .
 *
 * Collection is the group of objects declared as single unit .
 * Arrays also group of similar objects declared as single unit .
 *  
 */
public class Demo_Array_1 {

	public static void main(String[] args) {

		int noOfStudents[] = new int[5];
		noOfStudents[0] = 101;
		noOfStudents[1] = 102;
		noOfStudents[2] = 103;
		noOfStudents[3] = 104;
		noOfStudents[4] = 105;

		for (int index = 0; index < noOfStudents.length; index++) {
			System.out.println("Student Roll Number :- " + noOfStudents[index]);
		}
	}

}
