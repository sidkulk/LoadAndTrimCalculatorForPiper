package io.sidkulk.view.helper;

public class AircraftList {
	public static String[] getListOfAircrafts() {
		String[] aircraftList = { "SELECT", "VT-CHM", "VT-CHO", "VT-CHN", "VT-CHQ", "VT-CHE", "VT-CHR", "VT-CHS",
				"VT-CHT", "VT-CHX", "VT-CHY" };
		return aircraftList;
	}

	public static String[] getListOfAircraftType() {
		String[] aircraftTypeList = { "PA-28", "C-172", "DA-42" };
		return aircraftTypeList;
	}
}
