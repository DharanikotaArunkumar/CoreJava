package com.learnjava.topic36.staticmethod;

public interface DeviceAPI {
	
	String getOS();

	String getMaxResolution();

	String getBrand();
	
	default boolean isBlueToothEnabled(){
		return true;
	}
	
	static String termsAndConditionsText(){
		return " ALL rights are reserved ";
	}

}
