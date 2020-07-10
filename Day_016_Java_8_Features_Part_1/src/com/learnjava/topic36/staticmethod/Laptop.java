package com.learnjava.topic36.staticmethod;


public class Laptop implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Windows";
	}

	@Override
	public String getMaxResolution() {
		
		return "1024";
	}

	@Override
	public String getBrand() {
		
		return "Dell";
	}
	
	@Override
	public boolean isBlueToothEnabled() {

		return true;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(DeviceAPI.termsAndConditionsText());
	}

}
