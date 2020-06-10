package com.learnjava.topic35.defaultmethods.solution.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;
import com.learnjava.topic35.defaultmethods.solution.api.AbstractDevice;

public class AndroidSmartPhone extends AbstractDevice implements DeviceAPI {

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

		return true;
	}
}
