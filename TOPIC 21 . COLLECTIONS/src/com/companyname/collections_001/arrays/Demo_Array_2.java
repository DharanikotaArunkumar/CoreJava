package com.companyname.collections_001.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Lets see the problems with arrays 
 * 
 * 1) Arrays are fixed in size .
 * 
 */
public class Demo_Array_2 {

	public static void main(String[] args) {
		
		
		int noOfStudents[] = new int[5];
		noOfStudents[0] =101;
		noOfStudents[1] =102;
		noOfStudents[2] =103;
		noOfStudents[3] =104;
		noOfStudents[4] =105;
		
		for(int index=0;index<noOfStudents.length;index++){
			System.out.println("Student Roll Number :- "+noOfStudents[index]);
		}
		/*
		 * Now want to add new student roll number .Below codes throws ArrayIndexOutOfBoundsException as array size is fixed to 5 elements
		 * and we are trying to beyond its size .
		 */
		
		noOfStudents[5] =105;
		
		/*9*/
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++){
			list.add (i);
		}
		
		
		

	}

}
