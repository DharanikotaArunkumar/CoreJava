/* De serialization of student object .
 * 
 */

package com.companyname.module.submodule.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo_002_DeSerilization {

	public static void main(String[] args) {
	System.out.println("Deserialization of Student Object Started...");
		

		try {
		
		FileInputStream fileInput = new FileInputStream("E:\\Java Training\\01_Core Java Training\\StudentObject.ser");
		
		ObjectInputStream objectinput = new ObjectInputStream(fileInput);
		Student readObject = (Student) objectinput.readObject();
		
		System.out.println(readObject.hashCode());
			objectinput.close();
			fileInput.close();
			System.out.println(readObject);
			
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Deserialization of Student Object Completed...");



	}

}
