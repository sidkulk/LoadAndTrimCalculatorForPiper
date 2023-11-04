package io.sidkulk.view.helper;

import java.math.BigDecimal;
import java.math.RoundingMode;

import io.sidkulk.model.WindComponent;

public class DispatchHelper {
	private static BigDecimal bd;
	
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

		double crossWindComponent = windSpeed * Math.sin(Math.toRadians(angularDifference));
		double headWindComponent = windSpeed * Math.cos(Math.toRadians(angularDifference));

		return new WindComponent(getFormattedValue(crossWindComponent), getFormattedValue(headWindComponent));
	}
	
	public static double getFormattedValue(double value) {
		bd = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
