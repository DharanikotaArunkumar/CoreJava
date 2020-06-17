package com.learnjava.topic17.inheritancetypes;

/*
 * MultiLevel Inheritance 
 * 
 *   
 * 	 										GrandFather
 *	  											|
 *	          							      Father
 *												|
 *											   Son
 *
 *
*/

class GrandFather {

	String familyName;
	String grandFathername;
	float assets;

	GrandFather() {
		familyName = "XYZ";
		grandFathername = "KLM";
		assets = 5000000F;
	}

}

class Father extends GrandFather {
	String fatherName;

	Father() {
		fatherName = "ABC";
		assets = assets + 700000;

	}

}

class Son extends Father {

	String sonName;

	Son() {
		sonName = "DEF";
		assets = assets + 10000;

	}

}

public class Demo_Inheritance_02 {

	public static void main(String[] args) {
		Son sonObject = new Son();
		System.out.println(sonObject.familyName);
		System.out.println(sonObject.grandFathername);
		System.out.println(sonObject.fatherName);
		System.out.println(sonObject.sonName);
		System.out.println(sonObject.assets);

		Father father = new Father();

	}

}
