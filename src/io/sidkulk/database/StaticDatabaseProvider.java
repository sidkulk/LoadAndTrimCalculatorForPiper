package io.sidkulk.database;

import java.util.HashMap;
import java.util.Map;
import io.sidkulk.model.Aircraft;

public class StaticDatabaseProvider {
	private static Map<String, Aircraft> aircraftDatabase;
	static {
		if (aircraftDatabase == null)
			aircraftDatabase = new HashMap<>();
		System.out.println("Initializing aircraft database.");
		aircraftDatabase.put("VT-CHM",
				new Aircraft("VT-CHM", "Piper PA-28-181 Archer III", 2881558, 796.65, 1157.00, 219.68));
		aircraftDatabase.put("VT-CHE",
				new Aircraft("VT-CHE", "Piper PA-28-181 Archer III", 2881557, 797.10, 1157.00, 219.94));
		aircraftDatabase.put("VT-CHN",
				new Aircraft("VT-CHN", "Piper PA-28-181 Archer III", 2881559, 800.27, 1157.00, 219.49));
		aircraftDatabase.put("VT-CHO",
				new Aircraft("VT-CHO", "Piper PA-28-181 Archer III", 2881560, 799.37, 1157.00, 219.31));
		aircraftDatabase.put("VT-CHQ",
				new Aircraft("VT-CHQ", "Piper PA-28-181 Archer III", 2881566, 801.64, 1157.00, 219.13));
		aircraftDatabase.put("VT-CHR",
				new Aircraft("VT-CHR", "Piper PA-28-181 Archer III", 2881567, 802.09, 1157.00, 219.05));
		System.out.println("Database initialization complete!");
	}

	public static Map<String, Aircraft> getAircraftDatabase() {
		if (aircraftDatabase.isEmpty())
			throw new IllegalStateException("Aircraft database is Empty!");
		return aircraftDatabase;
	}
}
