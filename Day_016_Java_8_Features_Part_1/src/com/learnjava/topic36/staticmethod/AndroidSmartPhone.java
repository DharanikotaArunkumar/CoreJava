package com.learnjava.topic36.staticmethod;


public class AndroidSmartPhone implements DeviceAPI {
	
	

	@Override
	public String getOS() {
		return "Android OS";
	}

	@Override
	public String getMaxResolution() {
		return "624";
	}

	@Override
	public String getBrand() {
		return "One Plus";
	}

	@Override
	public boolean isBlueToothEnabled() {

		return false;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(DeviceAPI.termsAndConditionsText());
	}
}
