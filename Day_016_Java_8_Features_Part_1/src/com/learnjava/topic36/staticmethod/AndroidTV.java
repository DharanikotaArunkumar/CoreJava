package com.learnjava.topic36.staticmethod;


public class AndroidTV implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Android";
	}

	@Override
	public String getMaxResolution() {
		
		return "5280";
	}

	@Override
	public String getBrand() {
		
		return "Samsung";
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(DeviceAPI.termsAndConditionsText());
	}
	
}
