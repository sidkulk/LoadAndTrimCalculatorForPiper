package io.sidkulk.model;

public class Aircraft {
	private String registration;
	private String type;
	private Integer slNumber;
	private Double emptyWeight;
	private Double allUpWeight;
	private Double emptyWeightCG;

	public Aircraft(String registration, String type, Integer slNumber, Double emptyWeight, Double allUpWeight,
			Double emptyWeightCG) {
		super();
		this.registration = registration;
		this.type = type;
		this.slNumber = slNumber;
		this.emptyWeight = emptyWeight;
		this.allUpWeight = allUpWeight;
		this.emptyWeightCG = emptyWeightCG;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(Integer slNumber) {
		this.slNumber = slNumber;
	}

	public Double getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(Double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public Double getAllUpWeight() {
		return allUpWeight;
	}

	public void setAllUpWeight(Double allUpWeight) {
		this.allUpWeight = allUpWeight;
	}

	public Double getEmptyWeightCG() {
		return emptyWeightCG;
	}

	public void setEmptyWeightCG(Double emptyWeightCG) {
		this.emptyWeightCG = emptyWeightCG;
	}

}
