package com.learnjava.topic14.instanceblock;

class Vehicle{
	
	static int count ;
	
	
	static String country ;
	
	
	int regNumber;
	
	{
		count++;
		System.out.println("instance block called");
		System.out.println("no of vehicle sold "+count);
	}
	
	
	static{
		count =1000;
		country ="india";
		
		System.out.println("Static block called");
		
	}
	
	String name;
	
	Vehicle(){
		System.out.println("No Arg");
	}
	
	Vehicle(String name){
		this.name =name;
		System.out.println("1 Arg");
		
	}
	
	Vehicle(String name,String dist){
		this.name =name;
		System.out.println("2 Arg");
	}
	
	
}


public class Test1 {

	public static void main(String[] args) {
		
		
		System.out.println("Main started");
		
	/*	try {
			Class.forName("com.learnjava.topic14.instanceblock.Vehicle");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		System.out.println(Vehicle.count); // calss will be loaded
		System.out.println("static block calling over ?");
		System.out.println(Vehicle.country); 
		
		
		
		
		Vehicle audi = new Vehicle(); 
		audi.regNumber =123;
	//	audi.count =1;
		
	/*Vehicle bmw = new Vehicle();
		
		
		Vehicle tata = new Vehicle();
		
		
		Vehicle mm = new Vehicle("M&M");
		
		Vehicle audi1 = new Vehicle("adui","hyderbad");
		*/
	}

}
