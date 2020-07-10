/* This Program explains the how to serialize the object 
 * 
 */

package com.companyname.module.submodule.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

class Student implements Serializable {
	
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9166037858485865353L;
	private String stName;
	private String stRollNumber;
	private String stTotalMarks;
	private String stStaus;
	private LocalDateTime lastUpdatedLocalTime;
	private String stGrade;
	
	
	
	
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stRollNumber=" + stRollNumber + ", stTotalMarks=" + stTotalMarks
				+ ", stStaus=" + stStaus + ", lastUpdatedLocalTime=" + lastUpdatedLocalTime + "]";
	}
	
	public Student(String stName, String stRollNumber, String stTotalMarks, String stStaus) {
		super();
		this.stName = stName;
		this.stRollNumber = stRollNumber;
		this.stTotalMarks = stTotalMarks;
		this.stStaus = stStaus;
		this.lastUpdatedLocalTime = LocalDateTime.now();
		
		
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStGrade() {
		return stGrade;
	}

	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}

	public String getStRollNumber() {
		return stRollNumber;
	}
	public void setStRollNumber(String stRollNumber) {
		this.stRollNumber = stRollNumber;
	}
	public String getStTotalMarks() {
		return stTotalMarks;
	}
	public void setStTotalMarks(String stTotalMarks) {
		this.stTotalMarks = stTotalMarks;
	}
	public String getStStaus() {
		return stStaus;
	}
	public void setStStaus(String stStaus) {
		this.stStaus = stStaus;
	}
	public LocalDateTime getLastUpdatedLocalTime() {
		return lastUpdatedLocalTime;
	}
	public void setLastUpdatedLocalTime(LocalDateTime lastUpdatedLocalTime) {
		this.lastUpdatedLocalTime = lastUpdatedLocalTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}

public class Demo_001_Serialization {

	public static void main(String[] args) throws IOException {

		Student vijay = new Student("Ajay", "002", "95", "Passed out");

		serializeStudentObject(vijay);

	}

	private static void serializeStudentObject(Student vijay) {
		try {
			System.out.println("Serialization started");
			FileOutputStream fileOut = new FileOutputStream(
					"E:\\Java Training\\01_Core Java Training\\StudentObject.ser");

			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

			objOut.writeObject(vijay);

			objOut.close();
			fileOut.close();

			System.out.println("Serialization completed");

		} catch (IOException iOException) {
			iOException.printStackTrace();
		}
	}

}
