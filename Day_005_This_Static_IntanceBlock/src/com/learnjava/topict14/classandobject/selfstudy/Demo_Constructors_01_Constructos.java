package com.companyname.demo4.constructorscontinues;
/*
 * We can not call the constructor explicitly 
 */

class Car{
	Car(){
		System.out.println("He he he ....!!! you can not call me explicitly ..... one way is there with this keyword");
	}
	

}

public class Demo_Constructors_01_Constructos {

	public static void main(String[] args) {
		Car BMW = new Car();
		//BMW.Car();

	}

}
