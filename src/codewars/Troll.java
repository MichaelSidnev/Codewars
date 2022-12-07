package codewars;

public class Troll {
	static String str = "This website is for losers LOL!";

	public static String disemvowel(String str) {

		str = str.replaceAll("[aeiou]", "");
	return str;

}

	public static void main(String[] args) {
		System.out.println(disemvowel(str));
	}
}
