package com.learnjava.topic36.staticmethod;


public class SmartWatch implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "watchOS";
	}

	@Override
	public String getMaxResolution() {
		
		return "192";
	}

	@Override
	public String getBrand() {
		
		return "Apple";
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(DeviceAPI.termsAndConditionsText());
	}

}
