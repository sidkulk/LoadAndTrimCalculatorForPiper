package io.sidkulk.view.helper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import io.sidkulk.model.Aircraft;

public class LoadAndTrimCalculations {
	private static BigDecimal bd;

	public static String getAircraftWeightCGMoment(Aircraft aircraft) {
		double cgMoment = getFormattedValue(aircraft.getEmptyWeight() * aircraft.getEmptyWeightCG());
		return Double.toString(cgMoment);
	}

	public static double getFormattedValue(double value) {
		bd = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
