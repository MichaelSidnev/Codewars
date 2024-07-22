package codewars;

import java.util.HashMap;

public class Unexpected_parsing {

	public static HashMap<String, String> getStatus(boolean isBusy) {

		HashMap<String, String> status = new HashMap<String, String>();

		if (isBusy) {
			status.put("status", "busy");
		} else {
			status.put("status", "available");
		}

		return status;
	}

}