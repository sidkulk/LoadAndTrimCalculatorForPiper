package io.sidkulk.model;

public class LoadAndTrim {
	private double maxRampWeightSum;
	private double maxRampWeightMomentSum;
	private double maxAllUpWeight;
	private double maxAllUpWeightMomentArm;

	public LoadAndTrim(double maxRampWeightSum, double maxRampWeightMomentSum, double maxAllUpWeight,
			double maxAllUpWeightMomentArm) {
		super();
		this.maxRampWeightSum = maxRampWeightSum;
		this.maxRampWeightMomentSum = maxRampWeightMomentSum;
		this.maxAllUpWeight = maxAllUpWeight;
		this.maxAllUpWeightMomentArm = maxAllUpWeightMomentArm;
	}

	public double getMaxRampWeightSum() {
		return maxRampWeightSum;
	}

	public void setMaxRampWeightSum(double maxRampWeightSum) {
		this.maxRampWeightSum = maxRampWeightSum;
	}

	public double getMaxRampWeightMomentSum() {
		return maxRampWeightMomentSum;
	}

	public void setMaxRampWeightMomentSum(double maxRampWeightMomentSum) {
		this.maxRampWeightMomentSum = maxRampWeightMomentSum;
	}

	public double getMaxAllUpWeight() {
		return maxAllUpWeight;
	}

	public void setMaxAllUpWeight(double maxAllUpWeight) {
		this.maxAllUpWeight = maxAllUpWeight;
	}

	public double getMaxAllUpWeightMomentArm() {
		return maxAllUpWeightMomentArm;
	}

	public void setMaxAllUpWeightMomentArm(double maxAllUpWeightMomentArm) {
		this.maxAllUpWeightMomentArm = maxAllUpWeightMomentArm;
	}

}
