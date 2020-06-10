package com.learnjava.topic35.defaultmethods.problem.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;

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

}
