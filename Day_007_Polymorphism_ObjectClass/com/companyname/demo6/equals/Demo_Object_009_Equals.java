/*
 * We should also over ride hash code and to string method together .
 */

package com.companyname.demo6.equals;

class Student1 {

	int studentRollno;
	String studentName;
	float marks;

	public Student1(int studentRollno, String studentName, float marks) {
		super();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(marks);
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studentRollno;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (Float.floatToIntBits(marks) != Float.floatToIntBits(other.marks))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentRollno != other.studentRollno)
			return false;
		return true;
	}
	
	

}


public class Demo_Object_009_Equals {

	public static void main(String[] args) {
		
		Student1 vijay = new Student1(100, "Vijay", 75.45f);

		System.out.println(vijay.equals(vijay));

		Student1 rajesh = new Student1(200, "Rajesh", 75.45f);

		System.out.println(vijay.equals(rajesh));

		rajesh = vijay;
		System.out.println(vijay.equals(rajesh));

	}

}
