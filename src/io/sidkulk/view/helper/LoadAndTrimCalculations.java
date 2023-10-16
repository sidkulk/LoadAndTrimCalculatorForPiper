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

	public static double getRampFuelMoment(double rampFuelWeight, double acFuelArm) {
		return LoadAndTrimCalculations
				.getFormattedValue(rampFuelWeight * acFuelArm * Constants.SPECIFIC_GRAVITY_JET_A1);
	}

	public static double getFuelWeightValue(double fuelWeightValue) {
		return (fuelWeightValue * Constants.SPECIFIC_GRAVITY_JET_A1);
	}

	public static double getMaxAllUpWeight(double totalRampWeight) {
		return totalRampWeight - Constants.FUEL_ALLOWANCE;
	}

	public static double getMaxAllUpMoment(double momentSum) {
		return momentSum - Constants.FUEL_ALLOWANCE_MOMENT;
	}

	public static double getAllUpMoment(double maxAllUpMoment, double maxAllUpWeight) {
		return maxAllUpMoment / maxAllUpWeight;
	}

	public static double getBaggageAreaMoment(double baggageAreaWeight, double baggageAreaArm) {
		return baggageAreaWeight * baggageAreaArm;
	}

	public static double getPicMoment(double picWeight, double picArm) {
		return picWeight * picArm;
	}

	public static double getCopMoment(double copWeight, double copArm) {
		return copWeight * copArm;
	}

	public static double getRearPaxLHMoment(double rearPaxWeight, double rearPaxArm) {
		return rearPaxWeight * rearPaxArm;
	}

	public static double getRearPaxRHMoment(double rearPaxWeight, double rearPaxArm) {
		return rearPaxWeight * rearPaxArm;
	}
}
