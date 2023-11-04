package io.sidkulk.view.helper;

import io.sidkulk.model.WindComponent;

public class DispatchHelper {
	public static int getPressureAltitude(int elevation, int localQNH) {
		int pressureAltitude = elevation + ((1013 - localQNH) * 30);
		return pressureAltitude;
	}

	public static int getDensityAltitude(int pressureAltitude, int temperature) {
		int densityAltitude = pressureAltitude + ((temperature - 11) * 120);
		return densityAltitude;
	}

	public static WindComponent getWindComponent(int windDirection, int windSpeed, int runwayDirection) {
		// formula -> XWC = V*sin(D)
		// formula -> HWC = V*cos(D)
		int angularDifference = windDirection > runwayDirection ? windDirection - runwayDirection
				: runwayDirection - windDirection;

		angularDifference = Math.abs(angularDifference);
		System.out.println("Cos(90) = " + Math.round(Math.cos(Math.toRadians(90))));

		double crossWindComponent = windSpeed * Math.round(Math.sin(Math.toRadians(angularDifference)));
		double headWindComponent = windSpeed * Math.round(Math.cos(Math.toRadians(angularDifference)));

		return new WindComponent(crossWindComponent, headWindComponent);
	}
}
