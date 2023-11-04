package io.sidkulk.exceptions;

public class AllUpWeightOutOfLimitsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public AllUpWeightOutOfLimitsException() {
		
	}
	
	public AllUpWeightOutOfLimitsException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
