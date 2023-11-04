package io.sidkulk.model;

public class WindComponent {
	private double crossWindComponent;
	private double headWindComponent;

	public WindComponent(double crossWindComponent, double headWindComponent) {
		super();
		this.crossWindComponent = crossWindComponent;
		this.headWindComponent = headWindComponent;
	}

	public double getCrossWindComponent() {
		return crossWindComponent;
	}

	public void setCrossWindComponent(double crossWindComponent) {
		this.crossWindComponent = crossWindComponent;
	}

	public double getHeadWindComponent() {
		return headWindComponent;
	}

	public void setHeadWindComponent(double headWindComponent) {
		this.headWindComponent = headWindComponent;
	}

}
