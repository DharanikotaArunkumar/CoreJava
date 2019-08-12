package com.companyname.demo3.stringbuilder;



class EMP{
	public String name;
	public int salary;
	
	public EMP(String name1,int sal){
		name =name1;
		salary =sal;
	}

	@Override
	public String toString() {
		return "EMP [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class Demo_StringBuilder_6 {

	public static void main(String[] args) {
		EMP emp1 = new EMP("John",10);
		System.out.println(emp1);

	}

}
