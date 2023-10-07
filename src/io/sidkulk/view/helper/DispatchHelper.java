package io.sidkulk.view.helper;

public class DispatchHelper {
	public static int getPressureAltitude(int elevation, int localQNH) {
		int pressureAltitude = elevation + ((1013 - localQNH) * 30);
		return pressureAltitude;
	}

	public static int getDensityAltitude(int pressureAltitude, int temperature) {
		int densityAltitude = pressureAltitude + ((temperature - 11) * 120);
		return densityAltitude;
	}
}
