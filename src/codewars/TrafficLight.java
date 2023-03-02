package codewars;

public class TrafficLight {
	public static String updateLight(String current) {
		switch (current) {
		case ("red"):
			return "yellow";
		case ("yellow"):
			return "green";
		}
		return "red";
	}
}
