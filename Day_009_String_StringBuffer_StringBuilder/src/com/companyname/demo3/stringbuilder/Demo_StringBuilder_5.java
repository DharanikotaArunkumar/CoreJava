package com.companyname.demo3.stringbuilder;
class Customer{
	String cusName;
	String cusid;
	
	@Override
	public String toString() {
		return "Customer [cusName=" + cusName + ", cusid=" + cusid + "]";
	}
	
	
public String  toString(){
		
		//String temp=" Name :- "+name+"    "+"Pno"+phonenumber;
		 
		StringBuffer temp =new StringBuffer("");
		temp.append(" Name :- ").append(name);
		temp.append(" Pno :- ").append(phonenumber);
		
		
		StringBuilder temp =new StringBuilder("");
		temp.append(" cusid :- ").append(cusid);
		temp.append(" cusName :- ").append(cusName);	
		
		return temp.toString();
		
		
		// Define a string builder 
		//add all instance variables to it
		//convert to string
	
	
	}
	
	
}

class Person{
	
	String name ;
	String phonenumber;
	Customer cust1;
	
	
	Person(){
		cust1 =new Customer();
		cust1.cusName="hello";
	}
	
	
	
	
	public String  toString(){
		
		/*temp=" Name :- "+name+"    "+"Pno"+phonenumber;
		
		StringBuffer temp =new StringBuffer("");
		temp.append(" Name :- ").append(name);
		temp.append(" Pno :- ").append(phonenumber);
		*/
		
		StringBuilder temp =new StringBuilder("");
		temp.append(" Name :- ").append(name);
		temp.append(" Pno :- ").append(phonenumber);	
		temp.append(" Customer :- ").append(cust1.toString());	
		return temp.toString();
	
	
	}
}

public class Demo_StringBuilder_5 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name="joy";
		p1.phonenumber="123213";
		System.out.println(p1);
		
		
	}

}
