package io.sidkulk.test;

import io.sidkulk.model.WindComponent;
import io.sidkulk.view.helper.DispatchHelper;

public class TestWindComponent {
	public static void main(String[] args) {
		int windDirection = 258;
		int windSpeed = 04;
		int runwayInUse = 32;
		
		WindComponent componentObject = DispatchHelper.getWindComponent(windDirection, windSpeed, runwayInUse*10);
		System.out.println("Headwind component: " + componentObject.getHeadWindComponent());
		System.out.println("Crosswind component: " + componentObject.getCrossWindComponent());
	}
}
