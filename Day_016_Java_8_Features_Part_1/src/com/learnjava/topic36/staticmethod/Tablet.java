package com.learnjava.topic36.staticmethod;

public class Tablet implements DeviceAPI {

	@Override
	public String getOS() {

		return "Android";
	}

	@Override
	public String getMaxResolution() {

		return "768";
	}

	@Override
	public String getBrand() {

		return "Samsung";
	}

	public static void main(String[] args) {

		System.out.println(DeviceAPI.termsAndConditionsText());
	}

}
